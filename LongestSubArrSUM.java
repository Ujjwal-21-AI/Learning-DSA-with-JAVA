import java.util.*;
public class LongestSubArrSUM {
    public static int LongestSubArrSUM(int[] arr, int k){
        
        int right = 0; int left = 0;
        int maxLen = 0;
        long sum = arr[0];
        int n = arr.length;

        while (right < n){
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if(right < n){
                sum += arr[right];
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        System.out.println(LongestSubArrSUM(arr, k));
        sc.close();
    }
}
