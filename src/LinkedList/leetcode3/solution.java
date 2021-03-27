package LinkedList.leetcode3;
import LinkedList.ListNode;
import LinkedList.leetcode;
//删除一个链表中所有重复节点
public class solution {

    public static ListNode deletSame(ListNode head){

        if(head == null){
            return null;
        }

        ListNode p1 = head;
        ListNode prev = new ListNode(-1);
        ListNode newHead = prev;
        ListNode p2 = p1.next;


        while(p2 != null){
            if(p1.val != p2.val){
                prev = p1;
                p1 = p1.next;
                p2 = p2.next;

            }
            else{
                while (p2.next != null && p1.val == p2.val){
                    p2 = p2.next;

                }
                if(p2.next == null){
                    return newHead.next;
                }
                prev.next = p2;
                p1 = p2;
                p2 = p2.next;

            }
        }
        return newHead.next;

    }
    public static void main(String[] args) {

        ListNode n1 = new ListNode(16);
        ListNode n2 = new ListNode(10,n1);
        ListNode n3 = new ListNode(2,n2);
        ListNode n4 = new ListNode(2,n3);
        ListNode n5 = new ListNode(1,n4);
        ListNode n6 = new ListNode(1,n5);

        ListNode l1 = n6;
        ListNode s = deletSame(null);
        leetcode.printLinkedList(s);

    }
}
