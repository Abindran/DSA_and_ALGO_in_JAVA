public class CircularLinkedList {
    Node head = null;
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int new_value){
        Node new_node = new Node(new_value);
        if(head == null){
            head = new_node;
            head.next = head;
        }
        new_node.next = head;
        Node last_node = head;
        while(last_node.next != head){
            last_node = last_node.next;
        }
        head = new_node;
        last_node.next = head;
    }

    public void deleteNode(int value){

        //case 1
        if(head == null) return;

        //case 2
        Node req_node  = head,prev_node = null;
        while (req_node.data != value){
            if (req_node.next == head){
                System.out.println("The given value "+value+" is not found in the circular linked list to be deleted.");
                return;
            }
            prev_node = req_node;
            req_node = req_node.next;
        }

        // deleting the head
        //if head is the only one element
        if (req_node.next == head && prev_node ==null){
            head = null;
            return;
        }
        //deleting the head with more element
        //if head is not the only element
        else if (req_node == head){
            Node last_node = head;
            while (last_node.next!=head){
                last_node = last_node.next;
            }
            head = head.next;
            last_node.next = head;
        }
        //if node is the last node
        else if(req_node.next == head && prev_node != null){
            prev_node.next = head;
        }
        else {
            prev_node.next = req_node.next;
        }
    }
    public int getNodeCountHelper(Node node){
        if (node.next == head) return 0;
        return 1+getNodeCountHelper(node.next);
    }
    public int getNodeCount(){
        return getNodeCountHelper(head) + 1;
    }
    public void printList(){
        Node node = head;
        if (head == null) {
            System.out.println("There is no nodes in circular linked list.");
            return;
        }
        do {
            System.out.print(node.data + " -> ");
            node = node.next;
        }while(node!=head);
        System.out.println();
    }
    public static void main(String [] args){
        CircularLinkedList cllist = new CircularLinkedList();
        cllist.push(1);
        cllist.push(2);
        cllist.push(3);
        cllist.push(4);
        cllist.push(5);

        cllist.deleteNode(7);
        System.out.println("The total number of nodes is: " + cllist.getNodeCount());
        cllist.printList();
    }

}
