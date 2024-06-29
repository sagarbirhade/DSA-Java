class DiamondPattern{
    public static void main(String[] ags){
        int n = 4;
        // Row Printing loop
        for(int i=1;i<=n;i++){
            // Spaces Printing Loop
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            // '* ' printing
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=2;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
            // Lower half
            // Spaces Printing Loop
            // '* ' printing
        for(int i=n;i>=1;i--){
            // Spaces Printing Loop
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            // '* ' printing
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=2;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}