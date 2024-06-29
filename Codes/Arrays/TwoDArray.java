import java.util.Scanner;

class TwoDArray{
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int row = sc.nextInt();        
        System.out.print("Enter Column : ");
        int clm = sc.nextInt();

        int arr[][] = new int[row][clm];
        System.out.println("Enter The Elemets : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<clm;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Given Array : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<clm;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the Number to search : ");
        int number = sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<clm;j++){
                if(number == arr[i][j]){
                    System.out.println("Number Found at location[" + i + "," + j + "]");
                }
            }
        }
        
    }
}