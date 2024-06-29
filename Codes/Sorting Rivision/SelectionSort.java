

public class SelectionSort {
    public static void main(String[] args){
        
        int [] arr = {78,56,12,23,56,90};
        int n = arr.length;

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i = 0; i <= n-2; i++){
            int mini = i;
            for(int j = i; j <= n-1; j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
                int temp = arr[i];
                arr[i] = arr[mini];
                arr[mini] = temp;
            }
        } 
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
