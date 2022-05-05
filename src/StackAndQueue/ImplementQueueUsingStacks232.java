package StackAndQueue;

import java.util.Stack;

public class ImplementQueueUsingStacks232{
    Stack<Integer> stackPositive;
    Stack<Integer> stackNegative;
    public ImplementQueueUsingStacks232() {
        stackPositive = new Stack<>();
        stackNegative = new Stack<>();
    }

    public void push(int x) {
        if (stackNegative.isEmpty()){
            stackPositive.push(x);
        }else{
            while(!stackNegative.isEmpty()){
                stackPositive.push(stackNegative.pop());
            }
            stackPositive.push(x);
        }
    }

    public int pop() {
        while(!stackPositive.isEmpty()){
            stackNegative.push(stackPositive.pop());
        }
        return stackNegative.pop();
    }

    public int peek() {
        while(!stackPositive.isEmpty()){
            stackNegative.push(stackPositive.pop());
        }
        return stackNegative.peek();
    }

    public boolean empty() {
        return stackPositive.isEmpty()&&stackNegative.isEmpty();
    }
}
