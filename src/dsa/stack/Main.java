package dsa.stack;
import java.util.*;

public class Main {
    public static void main(String[] args){
        //write the code here
        Stack<Integer> stack = new Stack<>();  //stack is part of the vector class
        stack.push(34);
        stack.push(54);
        stack.push(32);
        stack.push(102);


        stack.pop(); // this returns the element on the top of the whole stack -> so every single time
                    // we pop the top element comes out hence the name last in first out


    }
}

//all the we use the array but instaed the name given for the specific function
// like the Last in first out hence stack
