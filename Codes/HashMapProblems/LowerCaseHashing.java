import java.util.Scanner;
public class LowerCaseHashing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "abacdcbaed";
        int n = s.length();

        //precomputing
        int hash[] = new int[26];
        for(int i = 0; i < s.length(); i++){     
            hash[s.charAt(i) - 'a']++;
        }
        
        int q = sc.nextInt();
        for(int i = 1; i <= q; i++){
            System.out.print("\nSearch: ");
            char c = sc.next().charAt(0);
            // fetching
            System.out.print("Frequency: "+hash[c - 'a']);
        }
    }
    
}
