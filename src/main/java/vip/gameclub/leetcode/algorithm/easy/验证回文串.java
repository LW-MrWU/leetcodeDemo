package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/9 14:36
 */
public class 验证回文串 {
    @Test
    public void test(){
        System.out.println(isPalindrome("race a car"));
    }

    public boolean isPalindrome(String s) {
        if(s.isEmpty())  return true;
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int length = s.length();
        for (int i=0; i<length/2; i++){
            if(s.charAt(i) != s.charAt(length-1-i))  return false;
        }
        return true;
    }
}
