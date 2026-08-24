import java.util.*;

public class UnionofTwo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 5, 6};

        ArrayList<Integer> union = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            if (union.get(union.size() - 1) != arr1[i])
                union.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            if (union.get(union.size() - 1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }

        System.out.println(union);
    }
}