import java.util.*;

public class removeDuplicatesLL{
    public static void main(String[] args){
         Linked_List ll = new Linked_List();

         ll.add(6);
         ll.add(2);
         ll.add(6);
         ll.add(2);
         ll.add(1);
         ll.add(3);
         ll.add(4);
         ll.add(1);


         Linked_List.Node p1 = ll.head;
         Linked_List.Node p2;

         while(p1!=null){
             p2 = p1;
             while(p2.next!=null){
                if(p1.data == p2.next.data){
                   p2.next = p2.next.next;
                   continue;
                }
                p2 = p2.next;
             }
             p1 = p1.next;
         }

         System.out.println(ll);
         
    }
}

// this can be done using hashset also but it will require extra space this does not require any space