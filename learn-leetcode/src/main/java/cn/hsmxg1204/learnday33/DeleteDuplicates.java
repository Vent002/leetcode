package cn.hsmxg1204.learnday33;

/**
 * @Author gxming
 * @Description 82. 删除排序链表中的重复元素 II
 * @CreateTime 2021-11-21 09:42
 */
public class DeleteDuplicates {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head){
        if(head == null){
            return head;
        }
        ListNode dummy = new ListNode(0,head);
        // 存放当前链表头节点
        ListNode cur = dummy;
        //
        while(cur.next != null &&cur.next.next != null){
            if (cur.next.val == cur.next.next.val){
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x){
                    cur.next = cur.next.next;
                }
            }else{
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
