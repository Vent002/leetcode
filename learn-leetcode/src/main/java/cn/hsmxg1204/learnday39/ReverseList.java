package cn.hsmxg1204.learnday39;

/**
 * @Author gxming
 * @Description 206. 反转链表
 * @CreateTime 2021-11-28 16:26
 */
public class ReverseList {
    class ListNode{
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /**
     *
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
}
