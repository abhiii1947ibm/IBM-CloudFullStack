package Java03;

import java.util.Stack;


class stackex{
        stackex() {
            Stack<Integer> stack = new Stack<>();

            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);

            System.out.println(stack.size());
            System.out.println(stack);

        }
    }

public class ds {

    public static void main(String[] args){

        stackex s = new stackex();

    }
    
}
