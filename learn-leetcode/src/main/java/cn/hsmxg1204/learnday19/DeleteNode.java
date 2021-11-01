package cn.hsmxg1204.learnday19;


/**
 * TODO
 *
 * @author gxming
 * @description
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
