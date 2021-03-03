package vip.gameclub.leetcode.algorithm.easy;

import org.junit.Test;
import vip.gameclub.leetcode.algorithm.util.TreeNode;

/**
 * TODO
 *
 * @author LW-MrWU
 * @date 创建时间 2021/3/2 15:42
 */
public class 对称二叉树 {
    @Test
    public void test(){
        boolean flag = isSymmetric(new TreeNode(1,new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3))));
        System.out.println(flag);
    }

    public boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }

    private boolean check(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }else if(p == null || q == null){
            return false;
        }else{
            return p.val==q.val || (check(p.left,q.right)&&check(p.right,q.left));
        }
    }
}
