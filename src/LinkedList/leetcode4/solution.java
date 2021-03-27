package LinkedList.leetcode4;
import LinkedList.ListNode;

//判断回文链表
public class solution {
    public static boolean isPalindrome(ListNode head){
        ListNode l1 = head;
        ListNode l2 = getMiddle(head);
        ListNode l3 = reverseList(l2);
        while(l1 != null && l3 != null){
            if(l1.val != l3.val){
                return false;
            }
            l1 = l1.next;
            l3 = l3.next;

        }
        return true;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while( cur != null){
            ListNode next = cur.next;
            cur.next = prev;

            prev = cur;
            cur = next;

        }
        return prev;


    }

    private static ListNode getMiddle(ListNode head) {

        int count = 0;
        for(ListNode cur = head;cur != null; cur = cur.next){
            count++;
        }
        ListNode ans = head;
        for(int i = 0;i < count/2;i++){
            ans = ans.next;
        }
        return ans;
    }

}
