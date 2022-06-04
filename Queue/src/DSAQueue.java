//In java , queue is available as an interface
//In java, DSAQueue is implemented using Linked list or Priority queue
import java.util.LinkedList;
import java.util.Queue;
public class DSAQueue {
    public static void main(String[] args) {
        Queue<String> Q = new LinkedList<>();
        Q.add("Captain America");
        Q.add("Iron man");
        Q.add("Hulk");
        Q.add("Thor");
        Q.add("Black widow");
        Q.add("Hawk eye");
        System.out.println("My Queue is: " + Q);
        //poll() - removes the first element and return it.
        System.out.println("Remove cap: " + Q.poll());
        System.out.println("My Queue is: " + Q);
        System.out.println("The first element is: " + Q.peek());
    }
}
