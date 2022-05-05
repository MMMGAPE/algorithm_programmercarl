package StackAndQueue;

import java.util.Stack;

public class EvaluateReversePolishNotation150 {
    public static void main(String[] args) {
        String[] a = {"4","13","5","/","+"};
        System.out.println(evalRPN(a));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String sub:tokens) {
            if (sub.equals("+")||sub.equals("-")||sub.equals("*")||sub.equals("/")){
                switch (sub) {
                    case "+":
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case "-":
                        Integer tmp1 = stack.pop();
                        stack.push(stack.pop() - tmp1);
                        break;
                    case "*":
                        stack.push(stack.pop() * stack.pop());
                        break;
                    default:
                        Integer tmp2 = stack.pop();
                        stack.push(stack.pop() / tmp2);
                        break;
                }
            }else{
                stack.push(Integer.valueOf(sub));
            }
        }
        return stack.pop();
    }
}
