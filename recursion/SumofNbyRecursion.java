package recursion;
import java.util.Scanner;

public class SumofNbyRecursion {
    static int Nsum(int n){
        if(n == 0){
            return 0;
        }
        return n + Nsum(n - 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = Nsum(n);
        System.out.println(sum);
        sc.close();
    }
}
