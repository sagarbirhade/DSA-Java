import java.util.*;
public class basicHashMap{
    public static void main(String[] args){
        // country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insert
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 154);

        System.out.println(map);

        // updating
        map.put("China", 120);
        System.out.println(map);

        // Search
        if(map.containsKey("China")){
            System.out.println("Key is present in the map");
        }
        else{
            System.out.println("Key is not present in the map");
        }

        // Iterator
        // for(int val : arr)
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" - "+e.getValue());
        }

    }
}