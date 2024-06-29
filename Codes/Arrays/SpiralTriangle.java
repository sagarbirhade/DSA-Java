import java.util.Scanner;

class SpiralTriangle{
    public static void main(String[] ags){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row : ");
        int row = sc.nextInt();
        System.out.print("Enter Column : ");
        int clm = sc.nextInt();

        int arr[][] = new int[row][clm];

        System.out.println("Enter The Elements : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<clm;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("the Given Array is : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<clm;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        int top = 0,bottom = row - 1;
        int right = clm - 1,left = 0;

        while(top<=bottom || left<=right)
        {
            for(int i=left;i<=right;i++){
                System.out.print(arr[top][i] + " ");
            }
            top = top + 1;
            
            for(int i=top;i<=bottom;i++){
                System.out.print(arr[i][right] + " ");
            }
            right = right - 1;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom = bottom - 1;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.print(arr[i][left] + " ");
                }
                left = left + 1;                
            }

        }


    }
}