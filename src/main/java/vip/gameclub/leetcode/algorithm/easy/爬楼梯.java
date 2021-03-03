package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/2/24 14:56
 */
public class 爬楼梯 {
    @Test
    public void test(){
        System.out.println(climbStairs(2));
    }

    public int climbStairs(int n) {
        if(n == 1) return 1;
        int a = 1;
        int b = 2;
        for (int i=3; i<=n; i++){
            int sum = a+b;
            a = b;
            b = sum;
        }
        return b;
    }
}
