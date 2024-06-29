class Numberpyramid{
    public static void main(String[] ags){
        int n = 5;
        // Row Loop
        for(int i=1;i<=n;i++){
            // Spaces Loop
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // Number Pyramid Printing Loop
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}