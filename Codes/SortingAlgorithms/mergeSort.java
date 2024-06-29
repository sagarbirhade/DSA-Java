import java.util.ArrayList;

public class mergeSort {
    public static void mS(int[] arr, int low, int high){
        if (low < high) {
            int mid = (low + high) / 2;
            mS(arr, low, mid);
            mS(arr, mid + 1, high);
            MergeSort(arr, low, mid, high);
        }
    }
    
    public static void MergeSort(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {45,23,67,12,98,34};
        mS(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
