import java.util.*;

public class test {

    public static void main(String[] args) {

        SetOfStack st = new SetOfStack(3);

        st.push(3);
        st.push(8);
        st.push(5);
        st.push(1);
        st.push(2);
        st.push(4);
        st.push(-10);
        st.push(1);
        st.push(-100);
        st.push(-20);
        st.push(-90);
        st.push(-5);
        st.push(-9);
        st.push(200);
        
        System.out.println(st.al.size());

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.popAt(1));
        
    }
}