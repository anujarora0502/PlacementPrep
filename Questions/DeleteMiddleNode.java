import java.util.*;

public class DeleteMiddleNode {
    public static void main(String[] args) {
        Linked_List ll = new Linked_List();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);



        System.out.println(ll);

        if(ll.head.next == null||ll.head.next.next == null){
            System.out.println("Sorry not possible");
        }else{
            
            Linked_List.Node p1 = ll.head;
            Linked_List.Node p2 = ll.head;
            
            while(p2.next!=null){
                if(p2.next.next == null){
                    break;
                }
                p2 = p2.next.next;
                p1 = p1.next;
            }


            p2 = ll.head;

            while(p2.next!=p1){
               p2 = p2.next;
            }

            p2.next = p2.next.next;
            
            System.out.println(ll);
        }
    }
}