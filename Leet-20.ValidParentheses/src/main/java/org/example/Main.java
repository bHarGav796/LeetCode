package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

//      20. Valid Parentheses
        String input = "{()}"; //given


        int itr = 0;
        char check;
        Stack<Character> stack = new Stack<>();

        while(itr<input.length()){
            check = input.charAt(itr);
            if(check == '(' || check == '{' || check == '[')
                stack.push(check);

            else if(!stack.isEmpty() && (stack.peek()=='(' && check== ')' || stack.peek()=='{' && check== '}' || stack.peek()=='[' && check== ']'))
                stack.pop();
            else {
                System.out.println(false);
                return;
            }
            itr++;
        }
        if(stack.isEmpty())
            System.out.println(true);
        else System.out.println(false);


    }
}