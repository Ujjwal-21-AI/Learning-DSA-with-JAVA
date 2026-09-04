import java.util.*;
public class rearrangeArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] ans = new int[n];
        int posIndex = 0;
        int negIndex = 1;

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(nums[i] < 0){
                ans[negIndex] = nums[i];
                negIndex += 2;
            }else{
                ans[posIndex] = nums[i];
                posIndex += 2;
            }
        }
        System.out.println(Arrays.toString(ans));
        sc.close();
    }
}