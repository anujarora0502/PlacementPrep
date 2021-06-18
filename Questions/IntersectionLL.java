import java.util.*;

public class IntersectionLL{
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);

        int[] arr1 = {1,2,3,4,5,6,7,8};

        ListNode current1 = head1;

        for(int i =1;i<arr1.length;i++){
            ListNode temp = new ListNode(arr1[i]);

            current1.next = temp;
            current1 = temp;
        }

        ListNode head2 = new ListNode(0);

        int[] arr2 = {0,2};

        ListNode current2 = head2;

        for(int i =1;i<arr2.length;i++){
            ListNode temp = new ListNode(arr2[i]);

            current2.next = temp;
            current2 = temp;
        }

        ListNode ahead4 = head1;

        for(int i = 0;i<3;i++){
            ahead4 = ahead4.next;
        }

        current2.next = ahead4;


        int length1 = 0;
        int length2 = 0;

        ListNode itr1 = head1;
        ListNode itr2 = head2;

        while(itr1!=null){
            length1++;
            itr1 = itr1.next;
        }

        while(itr2!=null){
            length2++;
            itr2 = itr2.next;
        }

        itr1 = head1;
        itr2 = head2;

        if(length1<length2){
          for(int i = 0;i<length2-length1;i++){
              itr2 = itr2.next;
          }
        }else if(length1>length2){
            for(int i = 0;i<length1-length2;i++){
                itr1 = itr1.next;
            }
        }

        while(itr1!=null&&itr2!=null){
            
            if(itr1 == itr2){
                System.out.println(itr1.data);
                return;
            }

            itr1 = itr1.next;
            itr2 = itr2.next;
        }

        System.out.println("Not found");

    }
}