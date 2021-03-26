package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/24 16:39
 */
public class Excel表列序号 {
    @Test
    public void test(){
        System.out.println(titleToNumber("A"));
    }

    public int titleToNumber(String columnTitle) {
        StringBuilder sb = new StringBuilder(columnTitle);
        sb.reverse();
        char[] chars = sb.toString().toCharArray();
        int result = 0;
        for (int i=0; i<chars.length; i++){
            int a = chars[i]-'A'+1;
            int j = i;
            while(j>0){
                a *= 26;
                j--;
            }
            result += a;
        }
        return result;
    }

    public int titleToNumber2(String s) {
        int ans = 0;
        for(int i=0;i<s.length();i++) {
            int num = s.charAt(i) - 'A' + 1;
            ans = ans * 26 + num;
        }
        return ans;
    }
}
