
import java.util.Scanner;import java.util.ArrayList;
public class RotateByDElements{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);

        System.out.print("Enter the number of position to rotrate by left: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(arr); 
        ArrayList<Integer> arr2 = rotateArray(arr, k);
           
         System.out.println(arr2);

    }


    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
     int n = arr.size();
    k = k % n;
    reverse(arr, 0, k - 1);
    reverse(arr, k , n -1 );
    reverse(arr, 0, n-1);
    return arr;
    }
    public static void reverse(ArrayList<Integer> arr, int start, int end){
    while(start <= end){
        int temp = arr.get(start);
        arr.set(start, arr.get(end));
        arr.set(end, temp);
        start++;
        end--;
    }
}}
