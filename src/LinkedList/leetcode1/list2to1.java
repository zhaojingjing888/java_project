package LinkedList.leetcode1;

import LinkedList.ListNode;
import LinkedList.leetcode;
//两个有序链表，按照大小顺序合并为一个链表

public class list2to1 {

    public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode last = new ListNode(-1);
        ListNode newHead = last;
        ListNode c1 = l1;
        ListNode c2 = l2;
        while(c1 != null && c2 != null){
            if(c1.val >= c2.val){
                last.next = c1;
                last = last.next;
                c1 = c1.next;

            }else {
                last.next = c2;
                last = last.next;
                c2 = c2.next;
            }
        }
        if(c1 != null){
            last.next = c1;
        }
        else{
            last.next = c2;
        }
        return newHead.next;
    }
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2,n1);
        ListNode n3 = new ListNode(3,n2);
        ListNode n4 = new ListNode(4,n3);

        ListNode l1 = n4;
        ListNode n11 = new ListNode(11);
        ListNode n22 = new ListNode(22,n11);
        ListNode n33 = new ListNode(33,n22);
        ListNode n44 = new ListNode(44,n33);

        ListNode l2 = n44;



        ListNode l = mergeTwoLists(l1,null);
        leetcode.printLinkedList(l);
    }
}
