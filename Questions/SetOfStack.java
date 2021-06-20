import java.util.*;

public class SetOfStack {
    ArrayList<pair> al = new ArrayList<>();
    int currentIndex = 0;
    int threshold;

    SetOfStack(int threshold) {
        this.threshold = threshold;
    }

    public void push(Integer data) {
        if (al.size() == 0) {
            al.add(new pair(new Stack<Integer>()));
        }

        if (al.get(currentIndex).st.size() == threshold) {
            al.add(new pair(new Stack<Integer>()));
            currentIndex++;
        }

        al.get(currentIndex).st.push(data);
    }

    public Integer pop() {
        if (al.size() == 0) {
            System.out.println("Stack is empty!");
        }
        Integer removedElement = al.get(currentIndex).st.pop();

        if (al.get(currentIndex).st.size() == 0) {
            al.remove(currentIndex);
            currentIndex--;
        }

        return removedElement;
    }

    public Integer popAt(int index) {
        if (al.size() == 0) {
            System.out.println("Stack is empty!");
        }
        Integer removedElement = al.get(index).st.pop();

        if (al.get(index).st.size() == 0) {
            al.remove(index);
        }

        return removedElement;
    }

    public class pair {
        Stack<Integer> st;

        pair(Stack<Integer> st) {
            this.st = st;
        }
    }
}