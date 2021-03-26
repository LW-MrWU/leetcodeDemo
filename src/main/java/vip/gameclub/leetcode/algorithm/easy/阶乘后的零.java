package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;

import java.math.BigInteger;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/24 16:54
 */
public class 阶乘后的零 {
    @Test
    public void test(){
        System.out.println(trailingZeroes(30));
    }

    public int trailingZeroes(int n) {
        long result = factorial(n);
        int count=0;
        while(result > 10 && result%10 == 0){
            count++;
            result /=10;
        }
        return count;
    }
    public long factorial(long number) {
        if (number == 0) return 1;
        return number * factorial(number - 1);
    }
}
