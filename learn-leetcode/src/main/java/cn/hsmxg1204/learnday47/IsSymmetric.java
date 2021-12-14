package cn.hsmxg1204.learnday47;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author gxming
 * @Description 对称二叉树
 * @CreateTime 2021-12-14 19:00
 */
public class IsSymmetric {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * 递归
     * @param root
     * @return
     */
    public static boolean isSymmetric(TreeNode root){
        return check(root,root);
    }

    private static boolean check(TreeNode node1,TreeNode node2){
        if(node1 == null && node2 == null){
            return true;
        }
        if(node1 == null || node2 == null){
            return false;
        }
        return node1.val == node2.val && check(node1.left,node2.right) && check(node1.right,node2.left);
    }
    public static boolean isSymmetricByForeach(TreeNode root){
        return checkByForeach(root,root);
    }

    private static boolean checkByForeach(TreeNode r,TreeNode l){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(r);
        queue.offer(l);
        while (!queue.isEmpty()){
            r = queue.poll();
            l = queue.poll();
            if(r == null && l == null){
                continue;
            }
            if((r == null || l == null) || r.val != l.val){
                return  false;
            }
            queue.offer(r.left);
            queue.offer(l.right);

            queue.offer(r.right);
            queue.offer(l.left);
        }
        return true;
    }
}
