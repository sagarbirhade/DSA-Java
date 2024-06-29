import java.util.Scanner;
public class UpperCaseHashing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "abcdefgavgAB;[].,//BNCnBcbdbecd";
        int n = s.length();

        //precompute
        int hash[] = new int[255];
        for(int i = 0; i < n; i++){
            hash[s.charAt(i)]++;
        }
        
        int q = sc.nextInt();
        for(int i = 1; i <= q; i++){
            System.out.print("\nSearch: ");
            char c = sc.next().charAt(0);
          
          //fetching
          System.out.print("Frequency: "+hash[c]);
        }
    }
    
}
