package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;
import vip.gameclub.leetcode.algorithm.util.ListNode;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/2/24 15:26
 */
public class 删除排序链表中的重复元素 {
    @Test
    public void test(){
        deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2))));
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        head.next = deleteDuplicates(head.next);
        if(head.val == head.next.val){
            head.next = head.next.next;
        }
        return head;
    }

    public ListNode deleteDuplicates2(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
