import java.util.Scanner;

class maxMin{
        public static void main(String[] ags){
            int number[] = {34,123,34,12,34,67};
            int min = number[0];
            int max = number[0];

            for(int i=0;i<number.length;i++){
                if(min>number[i]){
                    min = number[i];
                }
                if(max<number[i]){
                    max = number[i];
                }
            }
            System.out.println("Maximum : "+ max);
            System.out.println("Minimum : "+ min);
    
        
    }
}