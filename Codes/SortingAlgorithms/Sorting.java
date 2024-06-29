import java.util.ArrayList;

public class Sorting {
    public static void main(String args[]){
        int[] arr = {3,5,2,3,1,7};
        int n = arr.length - 1;
        
        System.out.println("Initial array: ");
        display(arr,n);

        System.out.println("\nSorted array : ");
        mS(arr , 0, arr.length - 1);
        display(arr,n);
        
    }
    // Selction sort
    public static void selection_sort(int[] arr, int n){
        for(int i = 0; i <= n-2; i++){
            int mini = i;
            for(int j = i; j <= n-1; j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        
    }
    public static void display(int arr[], int n)
    {
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    // Bubble sort
    public static void bubble_sort(int[] arr, int n){
        for(int i = n-1; i >= 0; i--){
            int didSwap = 0;
            for(int j = 0; j <= i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                break;
            }
        }
    }

    // Insertion Sort
    public static void insertion_sort(int arr[], int n){
        for(int i = 0; i <= n-1; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
                System.out.println("Loop Runs");
            }
            
        }
    }

    // Merge Sort
    public static void mS(int[] arr, int low, int high){
        if(low <= high) return;
        int mid = (low + high)/2;
        mS(arr,low,mid);
        mS(arr,mid+1,high);
        merge(arr, low, mid, high);
    }
    public static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        //[low....mid]
        //[mid+1...high]
        int left = low;
        int right = high;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
            }
            else{
                temp.add(arr[right]);
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
        }
        while(right <= high){
            temp.add(arr[right]);
        }
        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }

    }
   
    
}
