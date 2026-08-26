package Array.Easy;
import java.util.*;
public class FindnocaOnce {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int XOR = 0;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            XOR = XOR^arr[i];
        }
        System.out.println(XOR);
        sc.close();
    } 
}
