package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 *
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *  
 *
 * 提示：
 *
 * 0 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author LW-MrWU
 * @date 创建时间 2021/2/22 17:53
 */
public class 最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        String first = strs[0];
        for (int i=0; i<first.length(); i++){
            for (String str : strs){
                if(i >= str.length() || first.charAt(i) != str.charAt(i)){
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }

    @Test
    public void test(){
        System.out.println(longestCommonPrefix(new String[]{"ab","abc"}));
    }

}
