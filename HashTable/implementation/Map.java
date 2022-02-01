package implementation;

import java.util.ArrayList;

public class Map<K,V> {
    ArrayList<MapNode<K,V>> bucketList;
    int numOfBuckets;
    int size;

    public Map(){
        this.bucketList = new ArrayList<>();
        this.numOfBuckets = 5;
        for (int i = 0; i < this.numOfBuckets; i++) {
            this.bucketList.add(null);
        }
    }

    public int getSize(){
        return this.size;
    }

    public V getValue(K key){
        //get the bucketIndex
        int bucketIndex = getBucketIndex(key);

        //get the reference to Node that is present at that index
        MapNode<K,V> head = bucketList.get(bucketIndex);

        //traverse thru the LL to find the Key & its value
        while(head != null){
            //if key is found, then return its value
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }

        //if key is not found or if bucketIndex itself contains null
        return null;

    }

    public void insert(K key, V value){
        //get index of the bucket where you want to insert the k,v
        int bucketIndex = getBucketIndex(key);

        //get the Node that is inserted at that bucketIndex
        MapNode<K,V> head = bucketList.get(bucketIndex);

        //create a temp node pointing to head to traverse the LL to see if there already exists the key that you
        // are trying to insert. If yes, then update its value
        MapNode<K,V> temp = head;

        while(temp != null){
            if(temp.key.equals(key)){
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        
        /*If the bucketIndex is null means there are no elements OR if the key you are trying to insert does not exist already 
        in the map & is a completely new key, then just add it at the 0th position of LL
         */
        
        //create a new Mapnode 1st & make it a head
        MapNode<K,V> newNode = new MapNode<>(key, value);
        newNode.next = head;

        //set this new node as head in the bucketIndex
        bucketList.set(bucketIndex, newNode);
        this.size++;

        double loadFactor = (1.0 * this.size) / numOfBuckets;
        if(loadFactor > 0.7){
            reHash();
        }
    }

    private void reHash() {
        ArrayList<MapNode<K,V>> temp = this.bucketList;
        this.numOfBuckets = 2 * this.numOfBuckets;
        this.size = 0;
        this.bucketList = new ArrayList<>();
        for (int i = 0; i < this.numOfBuckets; i++) {
            this.bucketList.add(null);
        }

        for (int i = 0; i < temp.size(); i++) {
            MapNode<K,V> head = temp.get(i);
            while(head != null){
                K key = head.key;
                V value = head.value;
                insert(key, value);//this will insert temp's k,v in bucketList's k,v
                head = head.next;
            }
        }
    }

    public boolean removeKey(K key){
        //get the bucketIndex
        int bucketIndex = getBucketIndex(key);

        //get the reference to Node that is present at that index
        MapNode<K,V> head = bucketList.get(bucketIndex);

        //maintain previous ptr that connects head's
        MapNode<K,V> prev = null;

        while(head != null){
            //if key is found
            if(head.key.equals(key)){
                //if the key is NOT the 1st node of the LL, then it means prev will not be null. Make necessary connection
                if(prev != null){
                    prev.next = head.next;
                }
                //If it was 1st node, then prev would have been null. Then set directly the address of 2nd node of LL
                //in the bucketIndex. This way 1st node will be removed
                else{
                    bucketList.set(bucketIndex, head.next);
                }
                //reduce size of LL & return true indicating that key was removed
                this.size--;
                return true;
            }
            prev = head;
            head = head.next;
        }

        //if key was not found
        return false;
    }

    private int getBucketIndex(K key) {
        //get the hashcode by passing key to hash fucn. WE use Object class's hashCode()
        int hashCodeVal = key.hashCode();

        //Now we pass hashcode through compression to get the bucketIndex where we have to insert key & value
        int index = hashCodeVal % numOfBuckets;
        return index;
    }
}
