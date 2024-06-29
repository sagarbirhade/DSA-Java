class Rhombus{
    public static void main(String[] ags){
        int n = 5;
        // Row Printing Loop
        for(int i=1;i<=n;i++){
            // Spaces Printing loop
            for(int j=1;j<=(n-i);j++){
                System.out.print("   ");
            }
            // Star printing loop
            for(int j=1;j<=5;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}