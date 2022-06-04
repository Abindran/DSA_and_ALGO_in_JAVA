import java.util.Stack;
public class StackDS {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("Captain America");
        stack.push("Iron Man");
        stack.push("Thor");
        stack.push("Hulk");
        stack.push("BlackWidow");
        stack.push("Hawk eye");
        System.out.println("The stack is: " + stack);
        System.out.println("The pop-ed element is: " + stack.pop());
        System.out.println("The stack is " + stack);
        System.out.println("The top element is: " + stack.peek());
        System.out.println("Is the stack empty?: " + stack.empty());
    }
}
