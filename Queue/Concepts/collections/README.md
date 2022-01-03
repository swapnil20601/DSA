In collection framework, there is no direct Queue class as such like we have for LinkedList, ArrayList, Stack etc. We just have Queue interface which we either have to implement ourselves like we did Queue using Array or LL. OR other option is to use LinkedList class.
So LinkedList class indirectly has functions for queues. We can use them. See QueueCollections.java file

Follwoing are some important queue methods that we can use from LinkedList class

1) add(element) -- similar to enqueue(element)

2) offer(element) -- similar to add(). The only difference is, offer() returns false if you cannot add an element for some reason whereas add() doesn't return anything like tht

3) remove() -- similar to dequeue. Throws exception if queue is empty

4) poll() -- similar to dequeue. It returns null if the queue is empty

5) element() -- similar to front(). Throws exception if queue is empty

6) peek() -- similar to front(). It returns null if the queue is empty