// this is a stack in which we also need to create a function that returns min in stack in O(1)
// we can do this by keeping an extra min till the substack inside the stacknode

public class StackMin<T extends Comparable<T>>{

    StackNode<T> head;
    StackNode<T> min;
    StackNode<T> prevmin;
    
    private class StackNode<T>{
        T data;
        T min;
        StackNode<T> next;

        StackNode(T data){
          this.data = data;
        }
    }

    public void push(T data){
        StackNode<T> stNode = new StackNode<>(data);

        if(head == null){
            stNode.min = stNode.data;
            head = stNode;
        }else{
            if(stNode.data.compareTo(head.min)<0){
               stNode.min = stNode.data;
            }else{
                stNode.min = head.min;
            }
            stNode.next = head;
            head = stNode;
        }
    }

    public T pop(){
        T removedElement = head.data;

        head = head.next;

        return removedElement;
    }

    public T min(){
        return head.min;
    }
 

}