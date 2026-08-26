package Array.Easy;

import java.util.*;

public class Move0toEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int j = -1;

        // Find the first zero
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                j = i;
                break;
            }
        }

        // If there is no zero
        if(j != -1) {
            for(int i = j + 1; i < n; i++) {
                if(arr[i] != 0) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    j++;
                }
            }
        }

        // Print array
        System.out.print("Array after moving zeros: ");

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}