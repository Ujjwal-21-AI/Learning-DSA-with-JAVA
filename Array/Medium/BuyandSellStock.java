package Array.Medium;
import java.util.*;
public class BuyandSellStock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];

        for(int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }
        int mini = prices[0];
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            int cost = prices[i] - mini;
            maxProfit = Math.max(maxProfit, cost);
            mini = Math.min(mini, prices[i]);
        }
        System.out.println(maxProfit);
        sc.close();
    }
}
