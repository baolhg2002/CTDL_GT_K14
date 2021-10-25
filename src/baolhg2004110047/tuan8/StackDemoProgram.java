package baolhg2004110047.tuan8;
import java.util.Stack;

import baolhg2004110047.tuan4.Student;

public class StackDemoProgram {
    public static void main(String[] args) {
        
        Stack<String> stack;

        stack = new Stack<>();

        stack.push("Welcome");
        stack.push("To");
        stack.push("Data Structure and Algotithm");

        System.out.println(stack);

        String poped = stack.pop();

        System.out.println("Đã lấy ra từ danh stack " + poped);

        System.out.println("Phẩn tử còn lại của Stack");
        System.out.println(stack);

        Stack<Student> stack2;

    }
    
}
