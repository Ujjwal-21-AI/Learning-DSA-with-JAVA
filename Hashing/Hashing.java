package Hashing;
import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        // Input array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Precompute hash array
        int[] hash = new int[13]; // Stores frequency of numbers 0 to 12

        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Number of queries
        int q = sc.nextInt();

        while (q-- > 0) {
            int number = sc.nextInt();

            // Fetch frequency
            System.out.println(hash[number]);
        }

        sc.close();
    }
}