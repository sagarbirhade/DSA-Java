class InvertedHalfPyramidNumbers{
    public static void main(String[] ags){
        // row Loop
        int n = 5;
        for(int i=1;i<=n;i++){
            // Number Printing Loop
            for(int j=1 ;j<=(n-i+1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}