class InvertedHalfPyramid1180{
    public static void main(String[] args){
        int n = 4;
        // Outer Loop
        for(int i=1;i<=n;i++){
            // Spaces Loop
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // Star Loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}