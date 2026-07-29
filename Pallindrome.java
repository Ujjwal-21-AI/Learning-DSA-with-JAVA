import java.util.*;
public class Pallindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dup = n;
        int revN = 0;

        while(n > 0){
            int ld = n%10;
            revN = (revN * 10)+ld;
            n = n/10;
        }

        if(dup == revN){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    System.out.println();
    sc.close();
    }
}
