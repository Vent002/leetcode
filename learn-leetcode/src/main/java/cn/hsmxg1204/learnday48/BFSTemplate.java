package cn.hsmxg1204.learnday48;

import com.sun.istack.internal.NotNull;

import java.util.List;
import java.util.Objects;
import java.util.Queue;

/**
 * @Author gxming
 * @Description 广度优先搜索 模板
 * @CreateTime 2021-12-18 14:00
 */
public class BFSTemplate {

    static class TreeNode {
        public int val;
        public List<TreeNode> children;

        public TreeNode() {}

        public TreeNode(int _val) {
            val = _val;
        }

        public TreeNode(int _val, List<TreeNode> _children) {
            val = _val;
            children = _children;
        }
    };

    int BFS(@NotNull TreeNode root, TreeNode target){
        Queue<TreeNode> queue = null;
        int step = 0;
        // add root to queue
        queue.offer(root);
        // BFS root
        while (!queue.isEmpty()){
            step += 1;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(Objects.equals(node,target)){
                    return step;
                }
                List<TreeNode> children = node.children;
                for (TreeNode child : children) {
                    queue.offer(child);
                }
            }
        }
        return -1;
    }
}
