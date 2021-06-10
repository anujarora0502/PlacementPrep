import java.util.*;

public class test {

    public static void main(String[] args) {

        Linked_List ll = new Linked_List();

        for (int i = 0; i < 5; i++) {
            ll.add(i);
        }

        System.out.println(ll.length);

        
            ll.deleteNode(1);
        

        System.out.println(ll.length);

        System.out.println(ll);
    }
}