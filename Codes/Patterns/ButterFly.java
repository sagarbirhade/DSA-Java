class ButterFly{
    public static void main(String[] ags){
        int n = 5;
        // Row printing loop
        for(int i=1;i<=n;i++){
            // Code for upper Half
            // Star printing loop
            for(int j=1;j<=i;j++){
                System.out.print("* ");                
            }
            // Spaces Printing Loop
           int spaces = 2 * (n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            // Star Printing loop
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
            // Code for LowerHalf;
        }
        for(int i=n;i>=1;i--){
            // Code for upper Half
            // Star printing loop
            for(int j=1;j<=i;j++){
                System.out.print("* ");                
            }
            // Spaces Printing Loop
           int spaces = 2 * (n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            // Star Printing loop
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
            // Code for LowerHalf;
        }
    }
}
