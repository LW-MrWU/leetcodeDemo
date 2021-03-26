package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/18 15:34
 */
public class Excel表列名称 {
    @Test
    public void test(){
        System.out.println(convertToTitle(52));
    }
    public String convertToTitle(int columnNumber) {
        StringBuffer sb = new StringBuffer();
        while(columnNumber>0){
            columnNumber--;
            sb.append((char)(columnNumber%26+'A'));
            columnNumber /=26;
        }
        return sb.reverse().toString();
    }

}
