package Array.Medium;
import java.util.*;
public class MajorityEle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        int count = 0;
        int ele = 0;

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(count == 0){
                count = 1;
                ele = nums[i];
            }else if(ele == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        int count1 = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == ele){
                count1++;
            }
        }
        if(count1 >= n/2){
            System.out.println(ele);
        }else{
            System.out.println(-1);
        }
    }
}
