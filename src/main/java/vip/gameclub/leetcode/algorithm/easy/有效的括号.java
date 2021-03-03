package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *  
 *
 * 示例 1：
 *
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 *
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 *
 * 输入：s = "(]"
 * 输出：false
 * 示例 4：
 *
 * 输入：s = "([)]"
 * 输出：false
 * 示例 5：
 *
 * 输入：s = "{[]}"
 * 输出：true
 *  
 *
 * 提示：
 *
 * 1 <= s.length <= 10^4
 * s 仅由括号 '()[]{}' 组成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author LW-MrWU
 * @date 创建时间 2021/2/22 13:36
 */
public class 有效的括号 {
    public boolean isValid(String s) {
        int length = s.length();
        if(length%2==1){
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        Deque<Character> deque = new LinkedList<>();
        for (int i=0; i<s.length(); i++){
            Character character = s.charAt(i);
            if(map.containsKey(character)){
                if(deque.isEmpty() || deque.peek() != map.get(character)){
                    return false;
                }
                deque.pop();
            }else{
                deque.push(character);
            }
        }

        return deque.isEmpty();
    }

    @Test
    public void test(){
        isValid("()[]{}");
    }
}
