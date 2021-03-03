package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;
import vip.gameclub.leetcode.algorithm.util.TreeNode;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/2 16:45
 */
public class 平衡二叉树 {
    @Test
    public void test(){
        boolean flag = isBalanced(new TreeNode(1,new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3))));
        System.out.println(flag);
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }else {
            return Math.abs(getDepth(root.left) - getDepth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private int getDepth(TreeNode root){
        if(root == null){
            return 0;
        }else{
            return Math.max(getDepth(root.left), getDepth(root.right)) + 1;
        }
    }
}
