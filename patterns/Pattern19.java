package patterns;
import java.util.*;
public class Pattern19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 0;
        //upper half
        for(int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }
        //lower half
        int space1 = 2*n-2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=0; j<space1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            space1 -= 2;
        }
    }
}
