package vip.gameclub.leetcode.algorithm.util;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/2 15:30
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
