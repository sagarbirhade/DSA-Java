class Hollow_Square{
    public static void main(String [] args){
        int n = 4;
        int m = 5;

        // Outer Loop
        for(int i=1;i<=n;i++){
            
            // Inner Loop
            for(int j=1;j<=5;j++){
                if(i  == 1 || i == 4 || j == 1 || j == 5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}