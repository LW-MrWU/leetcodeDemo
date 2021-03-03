package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;

/**
 * 实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * 示例 1:
 *
 * 输入: 4
 * 输出: 2
 * 示例 2:
 *
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 *      由于返回类型是整数，小数部分将被舍去。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sqrtx
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author LW-MrWU
 * @date 创建时间 2021/2/23 18:05
 */
public class x的平方根 {
    public int mySqrt(int x) {
        double a = Math.sqrt(x);
        return (int)a;
    }

    @Test
    public void test(){
        System.out.println(mySqrt2(0));
    }

    public int mySqrt2(int x) {
        long left = 0;
        long right = Integer.MAX_VALUE;
        while (left < right) {
            // 这种取中位数的方法又快又好，是我刚学会的，原因在下面这篇文章的评论区
            // https://www.liwei.party/2019/06/17/leetcode-solution-new/search-insert-position/
            // 注意：这里得用无符号右移
            long mid = (left + right + 1) >>> 1;
            long square = mid * mid;
            if (square > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return (int) left;
    }

    @Test
    public void test2(){
        System.out.println(mySqrt3(8));
    }

    public int mySqrt3(int x) {
        int left = 0;
        int right = x;
        while(left<=right){
            int mid = left+(right-left)/2;
            if((long)mid*mid > x){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return (int)right;
    }
}
