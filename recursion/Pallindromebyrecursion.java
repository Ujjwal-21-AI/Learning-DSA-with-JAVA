package recursion;
import java.util.*;
public class Pallindromebyrecursion {
    static boolean pallin(String str, int left, int right){
        if(left>=right){
            return true;
        }

        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        return pallin(str, left+1, right-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(pallin(str, 0, str.length() -1)){
            System.out.println("It is a Pallindrome");
        }else{
            System.out.println("It is not a Pallindrome");
        }
        sc.close();
    }
}