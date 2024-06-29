import java.util.*;

public class Union2Array {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int i = 0;
        int j = 0;
        List<Integer> unionArr = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != a[i]) {
                    unionArr.add(a[i]);
                }
                i++;
            } else if (a[i] > b[j]) {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != b[j]) {
                    unionArr.add(b[j]);
                }
                j++;
            } else {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != a[i]) {
                    unionArr.add(a[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n1) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != a[i]) {
                unionArr.add(a[i]);
            }
            i++;
        }

        while (j < n2) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != b[j]) {
                unionArr.add(b[j]);
            }
            j++;
        }

        return unionArr;
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};

        List<Integer> union = sortedArray(a, b);

        System.out.println(union);
    }
}
