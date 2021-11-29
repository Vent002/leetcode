package cn.hsmxg1204.learnday33;

/**
 * @Author gxming
 * @Description 104. 二叉树的最大深度
 *  day25 做过
 * @CreateTime 2021-11-21 09:13
 */
public class MaxDepth {
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
    public static int maxDepth(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = maxDepth(node.left);
        int right = maxDepth(node.right);
        return 1 + Math.max(left,right);
    }
}
