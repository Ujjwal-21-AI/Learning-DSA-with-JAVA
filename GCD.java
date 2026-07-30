import java.util.*;
public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = Math.min(n,m); i>=1; i--){
            if(n%i == 0 && m%i == 0){
                System.out.print(i);
                break;
            }
        }
        sc.close();
    }
}
