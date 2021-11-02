package cn.hsmxg1204.learnday19;


/**
 * TODO
 *
 * @author gxming
 * @description 请编写一个函数，用于 删除单链表中某个特定节点 。在设计函数时需要注意，你无法访问链表的头节点 head ，
 * 只能直接访问 要被删除的节点 。
 *
 * 题目数据保证需要删除的节点 不是末尾节点 。
 *
 * @date 2021-11-01 9:17
 */
public class DeleteNode {


    /**
     *
     Definition for singly-linked list.
      */
     public static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

    public static void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
