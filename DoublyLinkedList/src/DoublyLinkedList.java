public class DoublyLinkedList {
    Node head = null;
    class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void push(int new_value){
        Node new_node = new Node(new_value);
        if(head == null) {
            head = new_node;
            return;
        }

        head.prev = new_node;
        new_node.next = head;
        head = new_node;
    }

    public void insertAt(Node prev,int new_value){
        Node new_node = new Node(new_value);
        if (prev == null){
            System.out.println("Previous node is null if the list is empty use the push method to insert the data.");
            return;
        }

        new_node.next = prev.next;
        new_node.prev = prev;
        prev.next = new_node;

        if(new_node.next != null){
            new_node.next.prev = new_node;
        }
    }
    public void append(int new_value){
        Node new_node = new Node(new_value);
        if (head == null){
            head = new_node;
            return;
        }
        Node last_node = head;
        while (last_node.next != null){
            last_node = last_node.next;
        }
        last_node.next = new_node;
        new_node.prev = last_node;
    }
    public void deleteNode(int value){
        if(head == null ) return;

        Node curr = head,prev=null;
        while (curr.data != value && curr.next != null){
            prev = curr;
            curr = curr.next;
        }
        if(curr.data != value){
            System.out.println("The given value is not found.");
            return;
        }
        if(curr == head && curr.next == null) {
            head = null;
        }
        else if(curr == head && curr.next!=null){
            head = head.next;
            head.prev=null;
        }
        else if(curr.next==null){
            curr.prev.next = null;
        }
        else{
            prev.next = curr.next;
            curr.next.prev = prev;
        }
    }
    public void printList(){
        if(head == null){
            System.out.println("The Doubly linked list is empty!");
        }
        System.out.println("The Doubly linked list is: ");
        Node last_node = head;
        while (last_node != null){
            System.out.print(last_node.data + " -> ");
            last_node = last_node.next;
        }
//        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLinkedList dllist = new DoublyLinkedList();
        dllist.append(1);
        dllist.append(2);
        dllist.append(3);
        dllist.insertAt(dllist.head, 4);
        dllist.push(0);
        dllist.deleteNode(3);
        dllist.printList();
    }
}
