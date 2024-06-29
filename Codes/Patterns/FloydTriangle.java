class FloydTriangle{
    public static void main(String[] ags){
        int n = 5;
        int number = 1;
        // Row Loop
        for(int i=1;i<=n;i++){
            //number Printing Loop
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number = number + 1;
            }
            System.out.println();
        }
        
    }
}