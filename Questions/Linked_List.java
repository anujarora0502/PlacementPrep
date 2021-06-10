public class Linked_List {

    Node head;
    Node tail;
    int length;

    public void add(int d) {
        if (head == null) {
            Node n = new Node(d);
            head = n;
            tail = n;
        } else {
            Node n = new Node(d);
            tail.next = n;
            tail = n;
        }

        length++;
    }

    public void deleteNode(int data){
         Node temp = head;
         while(temp.next!=null){
           if(temp.data == data){
               length--;
               head = head.next;
               break;
           }else{
               if(temp.next.data == data){
                   length--;
                   temp.next = temp.next.next;
                   break;
               }
           }

           temp = temp.next;
         }
    }

    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
        }
    }

    @Override
    public String toString() {
        String s = "[";
        Node temp = head;
        while (temp.next != null) {
            s += temp.data + ",";
            temp = temp.next;
        }
        return s + temp.data + "]";
    }

}