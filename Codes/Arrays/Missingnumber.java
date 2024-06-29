public class Missingnumber {
    public static int missingNumber(int[] a, int N) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < N; i++) {
            xor2 = xor2 ^ a[i];
            xor1 = xor1 ^ i + 1;
        }
        return xor1 ^ xor2;
    }

    public static int  sumApproach(int arr[], int n){
        int sum = (n*(n+1)) / 2;
        int s2 = 0;
        for(int i = 0; i < n; i++){
            s2 = s2 + arr[i];
        }
        return sum - s2;
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 7};
        int n = arr.length; // n is the length of the array
        int missingNum = sumApproach(arr, n);
        System.out.println("Missing number is: " + missingNum);
    }    
    
}
// All the approaches are right submitted on coding ninja