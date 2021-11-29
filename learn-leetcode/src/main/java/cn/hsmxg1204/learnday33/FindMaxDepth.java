package cn.hsmxg1204.learnday33;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author gxming
 * @Description 559. N 叉树的最大深度
 * @CreateTime 2021-11-21 09:10
 */
public class FindMaxDepth {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    /**
     * DFS 深度优先遍历
     * @param root
     * @return
     */
    public static int findMaxDepth(Node root){
        if(root == null){
            return 0;
        }
        int maxChildrenDepth = 0;
        List<Node> children = root.children;
        for (Node child : children){
            int childDepth = findMaxDepth(child);
            maxChildrenDepth = Math.max(maxChildrenDepth,childDepth);
        }
        return maxChildrenDepth + 1;
    }

    /**
     * 广度优先遍历
     * @param root
     * @return
     */
    public static int findMaxDepthByBFS(Node root){
        if(root == null){
            return 0;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        int ans = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size > 0){
                Node node = queue.poll();
                List<Node> children = node.children;
                for(Node child : children){
                    queue.offer(child);
                }
                size--;
            }
            ans++;
        }
        return ans;
    }
}
