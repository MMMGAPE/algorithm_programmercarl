package StackAndQueue;

import java.util.Objects;
import java.util.Stack;

public class ValidParentheses20 {
    public static void main(String[] args) {
        System.out.println(isValid("(])"));
    }
    public static boolean isValid(String s) {
        Stack<String> validStack = new Stack<>();
        for (char subset:s.toCharArray()) {
            if (subset=='('||subset=='['||subset=='{'){
               validStack.push(String.valueOf(subset));
            }else if (subset==')'||subset==']'||subset=='}'){
                if (validStack.isEmpty()){
                    return false;
                }else{
                    if (subset==')'&& validStack.peek().equals("(")){
                        validStack.pop();
                    } else if (subset==']'&& validStack.peek().equals("[")){
                        validStack.pop();
                    } else if (subset=='}'&& validStack.peek().equals("{")){
                        validStack.pop();
                    }else {
                        validStack.push(String.valueOf(subset));
                    }
                }
            }
        }
        return validStack.isEmpty();
    }
}
