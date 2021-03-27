package LinkedList.leetcode2;

import LinkedList.ListNode;
import LinkedList.leetcode;
//一个链表，给定x值，分为关于x大的和关于x小的，不改变原有链表相对顺序的情况下重新排序
public class soluiton {
    public static ListNode sortX(ListNode head,int x){

        ListNode head1 = new ListNode(-1);//存放小的
        ListNode last1 = head1;
        ListNode head2 = new ListNode(-1);//存放大的
        ListNode last2 = head2;
        ListNode cur = head;

        for(;cur != null;cur = cur.next){
            if(cur.val <= x){
                last1.next = cur;
                last1 = last1.next;

            }
            else{
                last2.next = cur;
                last2 = last2.next;


            }
        }
        last1.next = head2.next;
        last2.next = null;
        return head1.next;

    }

    public static void main(String[] args) {

        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(10,n1);
        ListNode n3 = new ListNode(6,n2);
        ListNode n4 = new ListNode(1,n3);

        ListNode l1 = n4;
        ListNode s = sortX(l1,2);
        leetcode.printLinkedList(s);

    }

}
