import java.util.*;

public class test {

    public static void main(String[] args) {

        StackMin<Integer> st = new StackMin<>();

        st.push(3);
        st.push(8);
        st.push(5);
        st.push(1);
        st.push(2);
        st.push(4);
        st.push(-10);

        System.out.println(st.min());
        st.pop();
        st.pop();
        System.out.println(st.min());
        st.pop();
        st.pop();
        System.out.println(st.min());
        
    }
}