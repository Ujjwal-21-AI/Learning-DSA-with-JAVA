package basicmaths;
import java.util.*;
public class FindPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        for(int  i=1; i<=n; i++){
            if(n%i == 0)
                count++;
        }
        if(count == 2){
            System.out.print("It is a Prime");
        }else{
            System.out.print("It is not a Prime");
        }
        sc.close();
    }
}
