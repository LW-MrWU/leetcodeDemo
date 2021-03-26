package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;

import java.util.Arrays;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/18 17:36
 */
public class 多数元素 {
    @Test
    public void test(){
        System.out.println(majorityElement(new int[]{3, 2, 3}));
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max=0,result=nums[0];
        for(int i=0; i<nums.length; i++){
            if(i+1==nums.length || nums[i+1] != nums[i]){
                if(i-max>max){
                    max = i-max;
                    result = nums[i];
                }
            }
        }
        return result;
    }
}
