package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/3 17:21
 */
public class 买卖股票的最佳时机 {
    @Test
    public void test(){
        System.out.println(maxProfit2(new int[]{1,2,3,4,5}));
    }

    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit=0;
        for (int i=1; i<prices.length; i++){
            if(prices[i]<buy){
                buy = prices[i];
            }else if(prices[i]-buy>profit) {
                profit = prices[i]-buy;
            }
        }
        return profit;
    }

    public int maxProfit2(int[] prices) {
        int buy = prices[0];
        int profit=0;
        for (int i=1; i<prices.length; i++){
            if(prices[i]<buy){
                buy = prices[i];
            }else{
                profit += prices[i]-buy;
                buy = prices[i];
            }
        }
        return profit;
    }
}
