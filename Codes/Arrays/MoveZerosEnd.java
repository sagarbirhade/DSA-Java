public class MoveZerosEnd {
    public static int[] moveZeros(int n, int[] a) {
        int j = -1;

        // Find the first zero in the array
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero found, return the array as is
        if (j == -1) {
            return a;
        }

        // Move non-zero elements after the first zero to the front
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                j++;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int[] arr = {8, 6, 9,3,0,0,3,0,3,4};
        int[] result = moveZeros(arr.length, arr);

        // Print the modified array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
