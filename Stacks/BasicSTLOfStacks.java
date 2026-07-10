package Stacks;

import java.util.Stack;

public class BasicSTLOfStacks {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println(st.size()==0);
        System.out.println("------------------------------------------------------------------------");
        st.push("Ritik");
        st.push("Rohit");
        st.push("Abhinav");
        st.push("Ankit");
        st.push("Himanshu");
        System.out.println("Size of Stack is: " + st.size()); //5
        System.out.println(st.peek()); //Last String jo ham daale hai wah print kar dega---
        System.out.println(st); //pura stacks print kar ke deega  ----O(n)
        st.pop();
        System.out.println(st +"New Size is:- "+ st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());//yaha bhi same ohhhi top ki value print krega
        String s= st.pop();
        System.out.println(s);
    }
}
