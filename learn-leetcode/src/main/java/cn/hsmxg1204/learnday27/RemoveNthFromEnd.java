package cn.hsmxg1204.learnday27;

/**
 * TODO
 *
 * @author gxming
 * @description 删除链表的倒数第 N 个结点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 进阶：你能尝试使用一趟扫描实现吗？
 * @date 2021-11-09 8:46
 */
public class RemoveNthFromEnd {
    public static MiddleNode.ListNode removeNthFromEnd(MiddleNode.ListNode head,int n){
        MiddleNode.ListNode p = head,q = head;
        // 快指针先走 n
        while (n-- != 0){
            q = q.next;
        }
        if(q == null){
            return head.next;
        }
        // 确保快指针比慢指针 快一步
        q = q.next;
        while (q != null){
            q = q.next;
            p = p.next;
        }
        // 删除
        p.next = p.next.next;
        return head;
    }
}
