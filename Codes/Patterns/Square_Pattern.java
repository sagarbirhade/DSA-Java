class Square_Pattern{
    public static void main(String [] args){
        int n = 5;
        int m = 5;
        //Outer Loop
        for(int i=1;i<=n;i++){
            // Inner Loop
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}