package recursion;

import java.util.*;
public class OnetoNbyRecursion{
    static void printnum(int n){
        if(n == 0){
            return;
        }

        printnum(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printnum(n);
        sc.close();
    }
}