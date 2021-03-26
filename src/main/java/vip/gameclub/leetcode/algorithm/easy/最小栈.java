package vip.gameclub.leetcode.algorithm.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/16 16:21
 */
public class 最小栈 {
    Deque<Integer> deque;

    /** initialize your data structure here. */
    public 最小栈() {
        deque = new LinkedList<>();
    }

    public void push(int x) {
        deque.push(x);
    }

    public void pop() {
        deque.pop();
    }

    public int top() {
        return deque.peek();
    }

    public int getMin() {
        Iterator<Integer> iterator = deque.iterator();
        int min = Integer.MAX_VALUE;
        while (iterator.hasNext()){
            min = Math.min(iterator.next(), min);
        }
        return min;
    }
}
