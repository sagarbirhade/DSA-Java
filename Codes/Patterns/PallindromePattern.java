class PallindromePattern{
    public static void main(String[] ags){
        int n = 5;
        // Row For Loop
        for(int i=1;i<=n;i++){
            // Spaces Printing Loop
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            // First half Loop 
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            // Second half Printing
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}