package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    public StackUsingQueues(){
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }
    public void push(int x) {
        while(!queue2.isEmpty()){
            queue1.offer(queue2.poll());
        }
        queue2.add(x);
    }

    public int pop() {
        return queue2.poll();
    }

    public int top() {
        return queue2.peek();
    }

    public boolean empty() {
        return queue1.isEmpty()&&queue2.isEmpty();
    }
}
