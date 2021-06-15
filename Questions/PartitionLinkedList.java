import java.util.*;

public class PartitionLinkedList {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Linked_List ll = new Linked_List();

        ll.add(3);
        ll.add(5);
        ll.add(8);
        ll.add(5);
        ll.add(10);
        ll.add(2);
        ll.add(1);

        int x = scn.nextInt();

        Linked_List.Node itr = ll.head;

        while (itr.next != null) {

            if (itr.next.data < x) {
                Linked_List.Node temp = ll.head;
                ll.head = itr.next;
                itr.next = itr.next.next;
                ll.head.next = temp;
            } else {
                itr = itr.next;
            }
        }

        System.out.println(ll);

    }
}