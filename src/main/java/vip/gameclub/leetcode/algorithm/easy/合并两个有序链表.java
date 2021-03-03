package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;
import vip.gameclub.leetcode.algorithm.util.ListNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 *
 * 示例 1：
 *
 *
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 * 示例 2：
 *
 * 输入：l1 = [], l2 = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：l1 = [], l2 = [0]
 * 输出：[0]
 *  
 *
 * 提示：
 *
 * 两个链表的节点数目范围是 [0, 50]
 * -100 <= Node.val <= 100
 * l1 和 l2 均按 非递减顺序 排列
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author LW-MrWU
 * @date 创建时间 2021/2/22 14:07
 */
public class 合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> list = new LinkedList();
        while(true){
            if(l1 == null && l2 == null) break;
            if(l1 != null){
                Integer val = l1.val;
                l1 = l1.next;
                list.add(val);
            }
            if(l2 != null){
                Integer val = l2.val;
                l2 = l2.next;
                list.add(val);
            }
        }
        Collections.sort(list);

        return recursion(null, list);
    }

    private ListNode recursion(ListNode result, List<Integer> list){
        if(list.isEmpty()){
            return result;
        }
        int i = list.get(0);
        list.remove(0);
        result = new ListNode(i, recursion(result, list));
        return result;
    }

    @Test
    public void test(){
        ListNode listNode = mergeTwoLists2(new ListNode(0,new ListNode(2,new ListNode(5))),new ListNode(1,new ListNode(3,new ListNode(4))));
        System.out.println(listNode);
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists2(l1, l2.next);
            return l2;
        }

    }

}

