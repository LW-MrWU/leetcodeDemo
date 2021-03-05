package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;
import vip.gameclub.leetcode.algorithm.util.TreeNode;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/3 15:32
 */
public class 路径总和 {
    @Test
    public void test(){
        System.out.println(hasPathSum(new TreeNode(1,new TreeNode(2),null), 1));
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.left == null && root.right == null) return targetSum == root.val;
        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
    }

}
