package implementation;

public class Driver {
   public static void main(String[] args) {
       Map<String, Integer> map = new Map<>();
       for (int i = 0; i < 20; i++) {
           map.insert("abc"+i, i+1);
       }
       
       System.out.println(map.getSize());
       System.out.println(map.removeKey("abc4"));
       System.out.println(map.removeKey("abc7"));
       System.out.println(map.removeKey("map99"));
       System.out.println(map.getSize());

       for (int i = 0; i < map.getSize(); i++) {
           System.out.println("key: abc"+i+": val: "+map.getValue("abc"+i));
       }
   } 
}
