package cn.hsmxg1204.learnday27;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-11-09 8:56
 */
public class MergeTwoLists {
    public class ListNode {
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
    public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode result = l1.val < l2.val ? l1:l2;
        result.next = mergeTwoLists(result.next,l1.val >= l2.val ? l2 : l1);
        return result;
    }
}
