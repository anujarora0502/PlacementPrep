import java.util.*;

public class PallindromeLinkedList {
    public static void main(String[] args) {
        // Linked_List ll = new Linked_List();

        // ll.add(1);
        // ll.add(2);
        // ll.add(3);
        // ll.add(3);
        // ll.add(2);
        // ll.add(1);

        // Stack<Integer> st = new Stack<>();

        // Linked_List.Node itr = ll.head;

        // while(itr!=null){

        // st.push(itr.data);

        // itr = itr.next;
        // }

        // itr = ll.head;

        // while(itr!=null){

        // if(itr.data != st.pop()){
        // System.out.println(false);
        // return;
        // }

        // itr = itr.next;
        // }

        // System.out.println(true);

        //// TRYING IT OUT WITH REVERSING THE LINKED LIST

        // ListNode revhead = null;

        // Linked_List.Node itr = ll.head;

        // while (itr != null) {

        // ListNode temp = new ListNode(itr.data);

        // temp.next = revhead;

        // revhead = temp;

        // itr = itr.next;
        // }

        // itr = ll.head;

        // while (itr != null && revhead != null) {
        // if (itr.data != revhead.data) {
        // System.out.println(false);
        // return;
        // }

        // itr = itr.next;
        // revhead = revhead.next;
        // }

        // System.out.println(itr == null && revhead == null);

        ListNode head = new ListNode(0);

        ListNode current = head;

        int[] arr = { 0, 1, 2, 2, 1, 0 };

        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);

            current.next = temp;
            current = temp;
        }

        int listLength = 0;

        ListNode itr = head;

        while (itr != null) {
            listLength++;
            itr = itr.next;
        }

        if (listLength == 1) {
            System.out.println(true);
            return;
        }

        if (listLength == 2) {
            if (head.data == head.next.data) {
                System.out.println(true);
                return;
            } else {
                System.out.println(false);
                return;
            }
        }

        System.out.println(PallindromeRecursive(head, listLength).isPallindrome);

    }

    public static class pair {
        ListNode n;
        boolean isPallindrome;

        pair(ListNode n, boolean isPallindrome) {
            this.n = n;
            this.isPallindrome = isPallindrome;
        }
    }

    public static pair PallindromeRecursive(ListNode node, int listLength) {
        if (listLength == 0 || listLength == 1) {
            if (listLength == 1)
                return new pair(node.next, true);
            else
                return new pair(node, true);
        }

        pair p = PallindromeRecursive(node.next, listLength - 2);

        if (p.isPallindrome == false || node.data != p.n.data) {
            return new pair(null, false);
        }

        return new pair(p.n.next, true);

    }

}