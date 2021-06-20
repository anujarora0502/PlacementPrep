import java.util.*;

public class LoopDetectionLL{
    public static void main(String[] args) {
        //this code will not run because i am doing it on leetcode so this is just for reference
         

    }

    public ListNode detectCycle(ListNode head) {
        
        ListNode p1 = head;
        ListNode p2 = head;
        
        if(head == null || head.next == null){
            return null;
        }
        
        while(p2!=null&&p2.next!=null){
            
            p1 = p1.next;
            p2 = p2.next.next;
            
            if(p1 == p2){
                break;
            }
        }
        
        if(p2 == null||p2.next==null){
            return null;
        }else{
            p1 = head;
            
            while(p1!=p2){
                p1 = p1.next;
                p2 = p2.next;
            }
            
            return p1;
        }
    }
}