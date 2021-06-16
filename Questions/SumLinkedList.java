// import java.util.*;

// public class SumLinkedList{
//     public static void main(String[] args) {
//         Linked_List ll1 = new Linked_List();

//         ll1.add(9);
//         ll1.add(7);
//         ll1.add(8);

//         Linked_List ll2 = new Linked_List();

//         ll2.add(6);
//         ll2.add(8);
//         ll2.add(5);

//         Linked_List sumList = new Linked_List();
//         int carry = 0;

//         Linked_List.Node itr1 = ll1.head;
//         Linked_List.Node itr2 = ll2.head;

//         while(itr1!=null&&itr2!=null){

//             int sum = itr1.data+itr2.data+carry;

//             sumList.add(sum%10);

//             carry = sum/10;

//             itr1 = itr1.next;
//             itr2 = itr2.next;
//         }

//         while(itr1!=null){

//             int sum = itr1.data+carry;

//             sumList.add(sum%10);

//             carry = sum/10;

//             itr1 = itr1.next;
//         }

//         while(itr2!=null){
//             int sum = itr2.data+carry;

//             sumList.add(sum%10);

//             carry = sum/10;

//             itr2 = itr2.next;
//         }

//         if(carry!=0){
//             sumList.add(carry);
//         }

//         System.out.println(sumList);

//     }
// }

////////////// Trying the same question with recursion

// import java.util.*;

// public class SumLinkedList {
//     public static void main(String[] args) {

//         int[] arr1 = { 9, 9, 9 };
//         int[] arr2 = { 9, 9, 9, 9, 9, 9, 9 };

//         ListNode l1 = new ListNode(arr1[0]);
//         ListNode l2 = new ListNode(arr2[0]);

//         ListNode itr1 = l1;
//         ListNode itr2 = l2;

//         for (int i = 1; i < arr1.length; i++) {
//             ListNode n = new ListNode(arr1[i]);
//             itr1.next = n;
//             itr1 = itr1.next;
//         }

//         for (int i = 1; i < arr2.length; i++) {
//             ListNode n = new ListNode(arr2[i]);
//             itr2.next = n;
//             itr2 = itr2.next;
//         }

//         ListNode result = sumListCalc(l1, l2, 0);

//         while (result != null) {
//             if (result.next != null)
//                 System.out.print(result.data + "->");
//             else
//                 System.out.print(result.data);
//             result = result.next;
//         }

//     }

//     public static ListNode sumListCalc(ListNode l1, ListNode l2, int carry) {

//         if (l1 == null && l2 == null) {
//             if (carry == 0)
//                 return null;
//             else
//                 return new ListNode(carry);
//         }

//         if (l1 == null) {
//             int sum = l2.data + carry;

//             carry = sum / 10;

//             sum %= 10;

//             ListNode resultNode = sumListCalc(null, l2.next, carry);

//             ListNode presentNode = new ListNode(sum);

//             presentNode.next = resultNode;

//             return presentNode;
//         }

//         if (l2 == null) {
//             int sum = l1.data + carry;

//             carry = sum / 10;

//             sum %= 10;

//             ListNode resultNode = sumListCalc(l1.next, null, carry);

//             ListNode presentNode = new ListNode(sum);

//             presentNode.next = resultNode;

//             return presentNode;
//         }

//         int sum = l1.data + l2.data + carry;

//         carry = sum / 10;

//         sum %= 10;

//         ListNode resultNode = sumListCalc(l1.next, l2.next, carry);

//         ListNode presentNode = new ListNode(sum);

//         presentNode.next = resultNode;

//         return presentNode;

//     }
// }

// NOW TRYING IT WITH RECURSION IF THE LINKED LIST WAS IN FORWARD ORDER NOT IN REvERSE

import java.util.*;

public class SumLinkedList {

    public static class wrapper {
        ListNode l;
        int carry;

        wrapper(ListNode l, int carry) {
            this.l = l;
            this.carry = carry;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {9,9,9,9};
        int[] arr2 = {9,9,9};

        ListNode l1 = new ListNode(arr1[0]);
        ListNode l2 = new ListNode(arr2[0]);

        ListNode itr1 = l1;
        ListNode itr2 = l2;

        for (int i = 1; i < arr1.length; i++) {
            ListNode n = new ListNode(arr1[i]);
            itr1.next = n;
            itr1 = itr1.next;
        }

        for (int i = 1; i < arr2.length; i++) {
            ListNode n = new ListNode(arr2[i]);
            itr2.next = n;
            itr2 = itr2.next;
        }

        // Now we are going to equate the length of the linked list so that we can add
        // them

        int length1 = 0;
        ListNode temp = l1;

        while (temp != null) {
            length1++;
            temp = temp.next;
        }

        int length2 = 0;
        temp = l2;

        while (temp != null) {
            length2++;
            temp = temp.next;
        }

        if (length1 < length2) {
            for (int i = 0; i < length2 - length1; i++) {
                ListNode n = new ListNode(0);
                n.next = l1;
                l1 = n;
            }
        } else if (length2 < length1) {
            for (int i = 0; i < length1 - length2; i++) {
                ListNode n = new ListNode(0);
                n.next = l2;
                l2 = n;
            }
        }

        wrapper result = sumListCalc(l1, l2);

        if (result.carry != 0) {
            ListNode carryNode = new ListNode(result.carry);
            carryNode.next = result.l;
            result.l = carryNode;
        }

        ListNode headNode = result.l;

        while (headNode != null) {
            if (headNode.next != null)
                System.out.print(headNode.data + "->");
            else
                System.out.print(headNode.data);
            headNode = headNode.next;
        }

    }

    public static wrapper sumListCalc(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return new wrapper(null, 0);
        }

        wrapper result = sumListCalc(l1.next, l2.next);

        int sum = l1.data + l2.data + result.carry;

        int carry = sum / 10;

        ListNode presentNode = new ListNode(sum % 10);

        presentNode.next = result.l;

        return new wrapper(presentNode, carry);

    }

}