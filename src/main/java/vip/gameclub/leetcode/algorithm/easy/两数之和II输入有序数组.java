package vip.gameclub.leetcode.algorithm.easy;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/18 15:24
 */
public class 两数之和II输入有序数组 {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        while(i<numbers.length){
            for (int j=i+1; j<numbers.length; j++){
                if(numbers[i]+numbers[j] == target) return new int[]{++i, ++j};
            }
            i++;
        }
        return null;
    }
}
