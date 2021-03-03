package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;
import vip.gameclub.leetcode.algorithm.util.TreeNode;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/2 16:06
 */
public class 二叉树的最大深度 {

    @Test
    public void test(){
        System.out.println(maxDepth(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
