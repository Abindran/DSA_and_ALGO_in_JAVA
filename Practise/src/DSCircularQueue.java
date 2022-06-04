public class DSCircularQueue {
    static class Queue{
        int front,rear,capacity;
        int[] queue;

        public Queue(int capacity) {
            this.capacity = capacity;
            queue = new int[capacity+1];
            front = rear = 0;
        }
        public void enqueue(int value){
            //Check if the queue is full
            rear = (rear+1) % queue.length;
            if(rear == front){
                System.out.println("The circular queue is full...");
                return;
            }
            // find the right position to insert value
            if (rear == 0){
                rear = queue.length -1;
            }else {
                rear = rear-1;
            }
            queue[rear] = value;
            //Updating the rear within the capacity
            rear = (rear+1) % queue.length;
        }
        public int dequeue(){
            if (rear == front){
                System.out.println("The circular queue is empty!!!");
                return -1;
            }
            int popval = queue[front];
            queue[front] = 0;
            front = (front+1)%queue.length;
            return popval;
        }
    }

    public static void main(String[] args) {
        Queue Q = new Queue(5);
    }
}
