import java.util.HashMap;

public class hashmap {
    
    //HashMap हा Java मधील एक collection class आहे जो key-value pair मध्ये data store करतो आणि fast access (O(1)) देतो.

   public static void main(String[] args) {
    HashMap<String,Double> map = new HashMap<>();
        map.put("apple",0.50);
        map.put("bannana", 0.25);
        // map.remove("apple");
        System.err.println(map.get("apple"));

    /*    put(key, value)	value add करणे
                get(key)	value मिळवणे
            remove(key)	    value delete करणे
        containsKey(key)	key आहे का check
                size()  	size मिळवणे*/
                
   }
}

