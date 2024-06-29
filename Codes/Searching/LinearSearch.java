import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {34, 12 ,56, 78, 12, 70};
    
        int n = arr.length;
        System.out.print("Enter the element to search: ");
        int num = sc.nextInt();
        LinearSearch(arr, n, num);
        
    }
    public static void LinearSearch(int[] arr, int n, int num){
        int found = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == num){
                System.out.print("\nElement found at index: "+i);
                found = 1;
                break;
            }
            
        }
        if(found == 0){
            System.out.print("\nElement not found!");
        }

    }
}
