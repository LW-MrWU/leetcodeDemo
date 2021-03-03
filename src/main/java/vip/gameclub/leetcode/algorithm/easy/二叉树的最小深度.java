package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;
import vip.gameclub.leetcode.algorithm.util.TreeNode;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/2 17:05
 */
public class 二叉树的最小深度 {

    @Test
    public void test(){
        System.out.println(minDepth(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }

    public int minDepth2(TreeNode root) {
        if(root == null){
            return 0;
        }else if(root.left == null){
            return minDepth(root.right);
        }else if(root.right == null){
            return minDepth(root.left);
        }else{
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int min_depth = Integer.MAX_VALUE;
        if (root.left != null) {
            min_depth = Math.min(minDepth(root.left), min_depth);
        }
        if (root.right != null) {
            min_depth = Math.min(minDepth(root.right), min_depth);
        }

        return min_depth + 1;
    }
}
