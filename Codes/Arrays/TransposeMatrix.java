import java.util.Scanner;
class TransposeMatrix{
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int clm = sc.nextInt();

        int arr[][] = new int[row][clm];
        System.out.println("Enter Array Elements : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<clm;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Given 2 D array is : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<clm;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose of Matrix is : ");
        for(int j=0;j<clm;j++){
            for(int i=0;i<row;i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}