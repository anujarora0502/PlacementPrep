import java.util.*;

public class sortedStack {
    public static void main(String[] args) {
        StackSorted st = new StackSorted();

        st.push(5);
        st.push(10);
        st.push(1);
        st.push(0);
        st.push(-1);
        st.push(100);
        st.push(29);

        System.out.println(st.pop()+" "+st.pop()+" "+st.pop()+" "+st.pop()+" "+st.pop()+" "+st.pop()+" "+st.peek()+" "+st.pop()+" ");

    }

    public static class StackSorted {
        Stack<Integer> st1;
        Stack<Integer> st2;

        StackSorted() {
            st1 = new Stack<>();
            st2 = new Stack<>();
        }

        public void push(Integer data) {
            if (st1.isEmpty()) {
                st1.push(data);
            } else {
                while (st1.peek() < data) {
                    st2.push(st1.pop());
                    if (st1.isEmpty()) {
                        break;
                    }
                }

                st1.push(data);

                while (st2.size() != 0) {
                    st1.push(st2.pop());
                }

            }
        }

        public Integer pop(){
            return st1.pop();
        }

        public Integer peek(){
            return st1.peek();
        }
    }
}