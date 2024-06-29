class Triangle0_1{
    public static void main(String[] ags){
        // Row Loop
        int n = 5;
        for(int i=1;i<=n;i++){
            //Number printing Loop
            for(int j=1;j<=i;j++){
                // Condition for 0 and 1
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}