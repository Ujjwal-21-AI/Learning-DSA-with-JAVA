package Array.Medium;

import java.util.*;
class Solution{
    public List<Integer> LeadersinArray(int[] nums){
        int n = nums.length;

        if(n == 0){
            return new ArrayList<>();
        }
        List<Integer> leaders = new ArrayList<>();
        int maxRight = nums[n-1];
        leaders.add(nums[n-1]);
        for(int i=n-2; i>=0; i--){
            if(nums[i] >=maxRight){
                leaders.add(nums[i]);
            }
            maxRight = Math.max(maxRight, nums[i]);
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
public class LeadersinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        List<Integer> leaders = obj.LeadersinArray(nums);

        for(int value : leaders){
            System.out.print(value + " ");
        }
        sc.close();
    }
}
