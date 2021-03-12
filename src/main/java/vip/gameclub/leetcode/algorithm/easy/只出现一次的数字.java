package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/9 15:28
 */
public class 只出现一次的数字 {
    @Test
    public void test(){
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }

    public int singleNumber(int[] nums) {
        return check(nums, 0);
    }

    private int check(int[] nums, int i){
        for (int j=0; i<nums.length&&j<nums.length; j++){
            if(i==j) continue;
            if(nums[i] == nums[j]){
                return check(nums, ++i);
            }
        }
        return nums[i];
    }
}
