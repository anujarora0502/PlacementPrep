import java.util.*;

public class TwoStackQueue {

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();// for holding elements at the time of dequeue

    public void enqueue(Integer data) {
        st1.push(data);
    }

    public Integer dequeue() {
        removeTillLastFillInOther(st1, st2);
        Integer removedElement = st1.pop();
        removeAllFillInOther(st2, st1);

        return removedElement;

    }

    public Integer peek() {
        removeTillLastFillInOther(st1, st2);
        Integer topElement = st1.peek();
        removeAllFillInOther(st2, st1);

        return topElement;

    }

    private void removeAllFillInOther(Stack<Integer> st1, Stack<Integer> st2) {
        while (st1.size() != 0) {
            st2.push(st1.pop());
        }
    }

    private void removeTillLastFillInOther(Stack<Integer> st1, Stack<Integer> st2) {
        while (st1.size() != 1) {
            st2.push(st1.pop());
        }
    }

}