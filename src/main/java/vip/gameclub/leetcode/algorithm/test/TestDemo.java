package vip.gameclub.leetcode.algorithm.test;

import org.junit.Test;
import vip.gameclub.leetcode.algorithm.util.ListNode;
import vip.gameclub.leetcode.algorithm.util.TreeNode;

import java.util.*;

/**
 * 测试用
 *
 * @author LW-MrWU
 * @date 创建时间 2021/2/24 10:00
 */
public class TestDemo {
    @Test
    public void test(){
        //int result = maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        //boolean result = isValid("{[]}");
        //String result = addBinary("11", "1");
        //ListNode result = deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2))));
        boolean result = isSameTree(new TreeNode(1, new TreeNode(2), null), new TreeNode(1, null, new TreeNode(2)));
        System.out.println(result);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }else if(p==null || q==null){
            return false;
        }else if(p.val != q.val){
            return false;
        }else{
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        head.next = deleteDuplicates(head.next);
        if(head.next.val == head.val){
            return head.next;
        }

        return head;
    }

    public String addBinary(String a, String b) {
        int c = Integer.parseInt(a,2)+Integer.parseInt(b,2);
        return Integer.toBinaryString(c);
    }

    public int maxSubArray(int[] nums) {
        for (int i=1; i<nums.length; i++){
            if(nums[i-1]>0){
                nums[i] = nums[i]+nums[i-1];
            }
        }
        return Arrays.stream(nums).max().getAsInt();
    }

    public String countAndSay(int n) {
        if(n==1) return "1";

        String pre = countAndSay(--n);
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (int i=0; i<pre.length(); i++){
            if(i+1 == pre.length()){
                return sb.append(i+1-j).append(pre.charAt(i)).toString();
            }
            if(pre.charAt(i) != pre.charAt(i+1)){
                sb.append(i+1-j).append(pre.charAt(i));
                j=i+1;
            }
        }
        return sb.toString();
    }

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j=1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;
    }

    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        Deque<Character> deque = new LinkedList<>();
        for (int i=0; i<s.length(); i++){
            if(deque.isEmpty() && !map.containsKey(s.charAt(i))) return false;
            if(deque.isEmpty()){
                deque.push(map.get(s.charAt(i)));
                continue;
            }
            Character character = deque.peek();
            if(s.charAt(i) != character){
                if(!map.containsKey(s.charAt(i))) return false;
                deque.push(map.get(s.charAt(i)));
                continue;
            }
            deque.pop();
        }

        if(deque.isEmpty()) return true;
        return false;
    }

    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if(len == 0) return 0;
        int left = 0;
        int right = len;
        while(left<right){
            int mid = left + (right-left)/2;
            if(nums[mid] < target){
                left = mid+1;
            }else {
                right = mid;
            }
        }
        return left;
    }

    public int mySqrt(int x) {
        int left = 0, right = x, ans = -1;
        while (left<=right){
            int mid = left + (right-left)/2;
            if((long)mid*mid > x){
                right = mid-1;
            }else{
                ans = mid;
                left = mid+1;
            }
        }
        return ans;
    }

    public int[] plusOne(int[] digits) {
        for (int i=digits.length-1; i>=0; i++){
            digits[i]++;
            digits[i] = digits[i]%10;
            if(digits[i] != 0) return digits;
        }

        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }

    public int search(int[] nums, int target) {
        int len = nums.length;
        if(len == 0) return -1;
        int left = 0;
        int right = len-1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return -1;
    }
}