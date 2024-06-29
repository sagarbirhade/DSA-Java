import java.util.Scanner;
public class RecursiveBinarySearch {
    public static void main(String[] args){
        int arr[] = {12,34,56,78,90,98};
        int low = 0;
        int n = arr.length;
        int high = n- 1;
        System.out.print("\nSearch: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.print("\nElement found at index: "+binarySearch(arr, low, high, target));


    }
    public static int binarySearch(int[] arr, int low, int high, int target){
        if(low > high) return -1; // Base case to stop recursion
        int mid = (low + high) / 2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target) return binarySearch(arr, low, mid - 1, target);
        else return binarySearch(arr, mid + 1, high, target);        
    }
}
