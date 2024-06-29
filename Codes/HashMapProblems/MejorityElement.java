
import java.util.Scanner;
import java.util.HashMap;
import java.util.*;
public class MejorityElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /* problem : Given the array of size n, find all the numbers 
         * that appear moret than [n/3] times
         * here in this case n = 9  (size of array)
         * [9/3] = 3
         * print the numbers having frequency greater than 3
         */
        int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        int n = arr.length;

        // precompute
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        // fetching
        for(int key: map.keySet()){
            if(map.get(key) > n/3){
                System.out.println("Number having frequency greater than 3 is "+key);
            }
        }

        // Aother way of fetching using iterator
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
           // System.out.println(e.getKey()+" - "+e.getValue());
           if(e.getValue() > n/3){
                System.out.println("Number having frequency greater than 3 is "+e.getKey());
           }

        }
        

    }
}
