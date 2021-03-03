package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;

/**
 * 给你一个字符串 s，由若干单词组成，单词之间用空格隔开。返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "Hello World"
 * 输出：5
 * 示例 2：
 *
 * 输入：s = " "
 * 输出：0
 *  
 *
 * 提示：
 *
 * 1 <= s.length <= 10^4
 * s 仅有英文字母和空格 ' ' 组成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/length-of-last-word
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author LW-MrWU
 * @date 创建时间 2021/2/23 13:46
 */
public class 最后一个单词的长度 {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        if(strs == null || strs.length<=0) return 0;
        String last = strs[strs.length-1];
        return last.length();
    }

    @Test
    public void test(){
        int result = lengthOfLastWord2("a");
        System.out.println(result);
    }

    public int lengthOfLastWord2(String s) {
        s = s.trim();
        if(s.length() == 0) return 0;

        for (int i=s.length()-1; i>=0; i--){
            if(String.valueOf(s.charAt(i)).equalsIgnoreCase(" ")) return s.length()-1-i;
        }
        return s.length();
    }
}
