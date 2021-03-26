package vip.gameclub.leetcode.algorithm.easy;

import vip.gameclub.leetcode.algorithm.util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/18 14:11
 */
public class 相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null && headB == null) return null;
        Set<ListNode> table = new HashSet<>();
        while(headA != null){
            table.add(headA);
            headA = headA.next;
        }
        while(headB != null){
            if(!table.add(headB)) return headB;
            headB = headB.next;
        }
        return null;
    }
}
