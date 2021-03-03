package vip.gameclub.leetcode.interview.easy;

import org.junit.Test;

import java.util.Arrays;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/2 17:38
 */
public class 判定是否互为字符重排 {

    @Test
    public void test(){
        System.out.println(CheckPermutation("abc", "bca"));
    }

    public boolean CheckPermutation(String s1, String s2) {
        char[] s1s = s1.toCharArray();
        char[] s2s = s2.toCharArray();
        Arrays.sort(s1s);
        Arrays.sort(s2s);
        return String.valueOf(s1s).equalsIgnoreCase(String.valueOf(s2s));
    }
}
