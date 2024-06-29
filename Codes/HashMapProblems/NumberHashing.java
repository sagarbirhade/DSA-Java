import java.util.Scanner;
public class NumberHashing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,1,2,3,4,6,4,8,9,1,10,5,4};
        int n = arr.length;
        
    
        // precomputing
        int hash[] = new int[13];
        for(int i = 0; i < n; i++){
            hash[arr[i]]++;
        }
        

        int q = sc.nextInt();
        for(int i = 1; i <= q; i++){
            System.out.print("\nEnter: ");
            int number = sc.nextInt();
            // fetching
            System.out.print("Appear: "+hash[number]);
           
        }
        
    }
    
}
