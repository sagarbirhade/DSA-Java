import java.util.Scanner;
class CheckAscending{
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size  = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter Array Elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();       
        }
        boolean flag = true;
        for(int i=0;i<arr.length - 1;i++){
            if(arr[i] > arr[i+1]){
                flag = false;
            }
        }

        if(flag==true){
            System.out.println("The array is sorted in Ascending order");
        }
        else{
            System.out.println("the array is not in ascending order");
        }
    }
}