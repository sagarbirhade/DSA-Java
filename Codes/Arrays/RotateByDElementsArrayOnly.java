import java.util.Scanner;
public class RotateByDElementsArrayOnly {
    public static void main(String args[]){

        int [] arr = {1,2,3,4,5,6,7};
    
        System.out.print("Enter the number of position to rotrate by left: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
       
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        rotateArray(arr, k);
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        } 
        

    }
    public static void rotateArray(int arr[] , int k) {
        int n = arr.length;
       k = k % n;
       reverse(arr, 0, k - 1);
       reverse(arr, k , n -1 );
       reverse(arr, 0, n-1);
      
       }
       public static void reverse(int []arr, int start, int end){
       while(start <= end){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
    
}

}