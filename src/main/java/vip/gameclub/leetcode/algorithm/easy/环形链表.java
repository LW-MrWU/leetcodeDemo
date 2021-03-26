package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;
import vip.gameclub.leetcode.algorithm.util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/9 15:58
 */
public class 环形链表 {
    @Test
    public void test(){
        System.out.println(hasCycle(new ListNode()));
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> table = new HashSet<>();
        while(head!=null){
            if(!table.add(head)) return true;
            head = head.next;
        }
        return false;
    }
}
