package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/9 14:57
 */
public class 删除字符串中的所有相邻重复项 {
    @Test
    public void test(){
        System.out.println(removeDuplicates("abbaca"));
    }

    public String removeDuplicates(String S) {
        int i=0;
        for (int j=1; j<S.length(); j++,i++){
            if(S.charAt(i) == S.charAt(j)){
                S = S.substring(0,i) + S.substring(j+1);
                return removeDuplicates(S);
            }
        }
        return S;
    }
}
