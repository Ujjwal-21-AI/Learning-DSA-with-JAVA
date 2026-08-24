import java.util.*;

public class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = 0;
        for (int i = 0; i <= n+1; i++) {
            target = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    target = 1;
                    break;
                }
            }
            if (target == 0) {
                System.out.println(i);
                return;
            }
        }
        sc.close();
    }
}