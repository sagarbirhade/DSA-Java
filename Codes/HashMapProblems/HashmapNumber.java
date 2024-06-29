
import java.util.Scanner;
import java.util.HashMap;
public class HashmapNumber {
    public static void main(String[] args){
        int arr[] = {1,2,3,1,4,3};
        int n = arr.length;

        //precomputation
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Queries Count: ");
        int q = sc.nextInt();// taking how many nymber of queries
        for(int i= 1; i <= q; i++){
            System.out.print("\nSearch: ");
            int number = sc.nextInt();

            //fetching
            System.out.print("frequency: "+map.get(number));
        }
        // Printing counts
        System.out.println("\nMap Keys: ");
        for (int key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }


    }    
}
