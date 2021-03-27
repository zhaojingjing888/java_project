package LinkedList;

public class leetcode {
    public static int getCount(ListNode head){
        ListNode node = head;
        int count = 0;
        while(node != null){
            count ++;
            node = node.next;

        }

        return count;
    }
    public static void printLinkedList(ListNode head){
        ListNode node = head;
        while(node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }
    public static void printLinkedListHead(ListNode head){
        System.out.println(head.val);
    }


    public static ListNode getKnode(ListNode head,int k){
        int count  = getCount(head);

        if(count  >= k){
            int num = count-k;
            ListNode node  = head;

            while( num > 0){
                node = node.next;

                num--;

            }
            return node;

        }
//        throw new RuntimeException("超出索引");
        return null;
    }

    public static void main(String[] args) {

        ListNode n6 = new ListNode(6);
        ListNode n5 = new ListNode(5,n6);
        ListNode n4 = new ListNode(4,n5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode n1 = new ListNode(1,n2);

        ListNode head = n1;
//        printLinkedList(head);
        int num = getCount(head);
//        System.out.println(num);
        head = getKnode(head,10);
        printLinkedListHead(head);
    }
}
