public class LinkedList {

    Node head=null;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int new_value){
        Node new_node = new Node(new_value);
        new_node.next = head;
        head = new_node;
    }

    public void insertAt(Node prev_node,int new_value){
        if(prev_node==null){
            System.out.println("Prev node is empty");
            return;
        }
        Node new_node = new Node(new_value);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    public void append(int new_value){
        Node new_node = new Node(new_value);
        if (head == null){
            head = new_node;
            return;
        }
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        last.next = new_node;
        return;
    }

    public void printList(){
        Node myNode = head;
        while(myNode != null){
            System.out.print(myNode.data + " ");
            myNode = myNode.next;
        }
        System.out.println();
    }
    public void deleteNode(int key){
        Node temp = head,prev=null;

        // case 1
        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        }

        // case 2
        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;

        // case 3

        if(temp == null){
            return;
        }
    }
    void deleteLinkedList(){
        head = null;
    }
    public int getNodeCount(Node node){
        if(node == null) return 0;

        return 1 + getNodeCount(node.next);
    }
    public int getCount(){
        return getNodeCount(head);
    }
    public int iterNodeCount(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count += 1;
            temp = temp.next;
        }
        return count;
    }

    public void reverseLinkedList(){
        Node prev = null,next = null,curr = head;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args){
        LinkedList llist = new LinkedList();
        llist.append(5);
        llist.push(6);
        llist.push(7);
        llist.push(8);
        llist.push(9);
        llist.printList();
//        llist.deleteNode(6);
        llist.printList();
        System.out.println("The count is: " + llist.getCount());
        System.out.println("The count is(iter): " + llist.iterNodeCount());
        llist.reverseLinkedList();
        llist.printList();

    }
}
