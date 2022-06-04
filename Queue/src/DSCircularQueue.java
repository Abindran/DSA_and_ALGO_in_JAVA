import java.util.Queue;
import java.util.LinkedList;
public class DSCircularQueue {
    static class Queue{
        int front;
        int rear;
        int[] queue;
        int capacity;

        public Queue(int capacity) {
            this.capacity = capacity;
            queue = new int[capacity+1];
            front = 0;
            rear = 0;
        }
        public void enqueue(int value){
            rear = (rear+1) % queue.length; // only checking purpose rear value will be changed later
            if(rear == front) {
                System.out.println("The circular queue is full...");
                return;
            }
            // rear is changing to insert position
            if(rear == 0){
                rear = queue.length -1;
            }else{
                rear = rear-1;
            }
            queue[rear] = value;
            rear = (rear+1)%queue.length;
        }
        public int dequeue(){
            if(rear == front){
                System.out.println("The circular queue is empty!!");
                return -1;
            }
            int popval = queue[front];
            queue[front] = 0;
            front = (front+1) % queue.length;
            return popval;
        }
        public void displayQueue(){
            System.out.println("The circular queue is: ");
            for (int i=0;i<queue.length;i++){
                System.out.print( queue[i]+" -> ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue Q = new Queue(5);
        Q.enqueue(5);
        Q.enqueue(6);
        Q.enqueue(7);
        Q.enqueue(8);
        Q.enqueue(9);
        Q.dequeue();
//        Q.enqueue(10);
        Q.enqueue(10);
        Q.dequeue();
        Q.enqueue(11);
        Q.dequeue();
        Q.enqueue(12);
        Q.displayQueue();
    }
}
