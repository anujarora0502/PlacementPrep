// import java.util.*;

// public class ReturnKthToLast{
//     public static void main(String[] args){
//       Scanner scn = new Scanner(System.in);
//       Linked_List ll = new Linked_List();

//       ll.add(1);
//       ll.add(2);
//       ll.add(3);
//       ll.add(4);
//       ll.add(5);
//       ll.add(6);
//       ll.add(7);
//       ll.add(8);

//       int k = scn.nextInt();

//       int length = 0;

//       Linked_List.Node temp = ll.head;

//       while(temp!=null){
//         length++;
//         temp = temp.next;
//       }

//       int actualPosition = length - k;

//       Linked_List.Node result = ll.head;

//       while(actualPosition!=0){
//          result = result.next;
//          actualPosition--;
//       }

//       System.out.println(result.data);

//     }
// }

/// much better solution is to keep two pointers k nodes apart

import java.util.*;

public class ReturnKthToLast {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    Linked_List ll = new Linked_List();

    ll.add(1);
    ll.add(2);
    ll.add(3);
    ll.add(4);
    ll.add(5);
    ll.add(6);
    ll.add(7);
    ll.add(8);

    int k = scn.nextInt();

    Linked_List.Node p1 = ll.head;
    Linked_List.Node p2 = ll.head;

    while (k != 0) {
      p2 = p2.next;
      k--;
    }

    while (p2 != null) {
      p1 = p1.next;
      p2 = p2.next;
    }

    System.out.println(p1.data);

  }
}
