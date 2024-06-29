import java.util.*;

public class consecutiveOnes1 {
    
    public static int consecutiveOnes(int n, int[] arr) {
        int maxi = 0; // To store the maximum count of consecutive ones
        int cnt = 0;  // To store the current count of consecutive ones
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++; // Increment count for consecutive ones
                if (cnt > maxi) {
                    maxi = cnt; // Update maximum count if current count is greater
                }
            } else {
                cnt = 0; // Reset count for consecutive ones
            }
        }
        
        return maxi; // Return the maximum count of consecutive ones
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int n = arr.length;
        
        int maxConsecutiveOnes = consecutiveOnes(n, arr);
        
        System.out.println("Maximum consecutive ones: " + maxConsecutiveOnes);
    }
}
