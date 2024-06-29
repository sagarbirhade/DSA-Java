public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {45,12,45,12,34,687};
        int n = arr.length;

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        for(int i = n-1; i >= 0; i-- ){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
