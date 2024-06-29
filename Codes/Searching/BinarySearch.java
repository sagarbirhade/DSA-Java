import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {12, 23, 34, 45, 67, 89};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Search: ");
        int num = sc.nextInt();
        int index = binarySearch(arr, n, num);
        System.out.print("\nElement found at index: "+ index);
    }

    public static int binarySearch(int[] arr, int n, int num) {
        int low = 0; // Initialize low with index of first element
        int high = n - 1; // Initialize high with index of last element

        while (low <= high) {
            int mid = low + (high - low) / 2; // Better way to avoid integer overflow
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
