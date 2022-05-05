package StackAndQueue;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString1047 {
    public String removeDuplicates(String s) {
        Stack<String> stack = new Stack<>();
        for (char sub:s.toCharArray()) {
            if (stack.isEmpty()){
                stack.push(String.valueOf(sub));
            }else{
                if (stack.peek().equals(String.valueOf(sub))){
                    stack.pop();
                }else {
                    stack.push(String.valueOf(sub));
                }
            }
        }
        String result = "";
        while(!stack.isEmpty()){
            result = result.concat(stack.pop());
        }
        return new StringBuffer(result).reverse().toString();
    }
}
