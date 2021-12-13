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

    /**
     * 递归实现链表合并
     * @param l1 链表1
     * @param l2 链表2
     * @return
     */
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

    /**
     * 迭代合并
     * @param list1 链表1
     * @param list2 链表2
     * @return
     */
    public ListNode mergeTwoListsV2(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode node = new ListNode(-1) ;
        // 当前指向位置
        ListNode cur = node;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val ){
                cur.next = list1;
                list1 = list1.next;
            }else{
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if(list1 == null){
            cur.next = list2;
        }else{
            cur.next = list1;
        }
        return node.next;
    }

}
