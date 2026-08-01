package basicmaths;
import java.util.*;
public class ArmstrongNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while(temp>0){
            int digit = temp % 10;
            sum = sum + (digit*digit*digit);
            temp = temp/10;
        }
        if(sum == n)
            System.out.print("Armstrong Number");
        else
            System.out.print("Not an Armstrong Number");

        sc.close();
    }    
}
