package vip.gameclub.leetcode.interview.easy;

import org.junit.Test;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/2 17:43
 */
public class URL化 {
    @Test
    public void test(){
        System.out.println(replaceSpaces("Mr John Smith    ", 13));
    }

    public String replaceSpaces(String S, int length) {
        StringBuilder sb = new StringBuilder();
        char[] chars = S.toCharArray();
        for (int i=0; i<length; i++){
            if(chars[i] == ' '){
                sb.append("%20");
                continue;
            }
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
