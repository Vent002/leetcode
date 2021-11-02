package cn.hsmxg1204.learnday20;

import java.util.List;
import java.util.Stack;

/**
 * TODO
 *
 * @author gxming
 * @description 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 *  
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 * 示例 2：
 *
 *
 * 输入：head = [1,2]
 * 输出：[2,1]
 * 示例 3：
 *
 * 输入：head = []
 * 输出：[]
 *  
 *
 * 提示：
 *
 * 链表中节点的数目范围是 [0, 5000]
 * -5000 <= Node.val <= 5000
 *  
 *
 * 进阶：链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？
 *
 * @date 2021-11-02 9:43
 */
public class ReverseList {

/**
 *  Definition for singly-linked list.
 * 最简单的一种方式就是使用栈，因为栈是先进后出的。
 * 实现原理就是把链表节点一个个入栈，当全部入栈完之后再一个个出栈，出栈的时候在把出栈的结点串成一个新的链表。
 */
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /**
     * 使用栈解决
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null){
            stack.push(head);
            head = head.next;
        }
        if(stack.isEmpty()){
            return null;
        }
        ListNode node = stack.pop();
        ListNode dummy = node;
        while (!stack.isEmpty()){
            node.next = stack.pop();
            node = node.next;
        }
        node.next = null;
        return dummy;
    }

    /**
     * 使用双链表解决
     * @param head
     * @return
     */
    public ListNode reverseListByDoubleList(ListNode head){
        ListNode newHead = null;
        while(head != null){
            // 记录当前节点的下一个节点
            ListNode temp  = head.next;
            // 反转链表，原链表的next 指向新链表的 head
            head.next = newHead;

            newHead = head;
            // 移动原链表的head 到下一个节点
            head = temp;
        }
        return newHead;
    }

    /**
     * 使用递归
     * @param head
     * @return
     */
    public ListNode reverseListByRecursion(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newNode = reverseListByRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
}
