package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/5 14:26
 */
public class 用栈实现队列 {
    List<Integer> list;

    /** Initialize your data structure here. */
    public 用栈实现队列() {
        list = new ArrayList<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        list.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(empty()) return -1;
        int result = list.get(0);
        list.remove(0);
        return result;
    }

    /** Get the front element. */
    public int peek() {
        if(empty()) return -1;
        return list.get(0);
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return list == null || list.size()<=0;
    }

    @Test
    public void test(){
        用栈实现队列 test = new 用栈实现队列();
        test.push(1);
        test.push(2);
        int peek = test.peek();
        int pop = test.pop();
        boolean flag = test.empty();
        System.out.println(flag);
    }
}
