package DSALinkedList;

public class CircularLinkedList {
    Node head = null;

    public void cllPush(int new_value){
        Node new_node = new Node(new_value);
        if(head==null){
            head = new_node;
            head.next = head;
            return;
        }
        new_node.next = head;
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        head = new_node;
        temp.next = head;
    }
    public void cllInsertAfter(int index,int new_value){
        Node prev = head;
        if(head == null){
            System.out.println("The linked list is empty!!");
            return;
        }
        int i=1,size=cllGetNodeCount();
        if(index > size-1) {
            System.out.println("Index Out of bound!!");
            return;
        }
        while(i<=index){
            prev = prev.next;
            i++;
        }
        Node new_node = new Node(new_value);
        new_node.next = prev.next;
        prev.next = new_node;
    }
    public void cllAppend(int new_value){
        Node new_node = new Node(new_value);
        if (head == null){
            head = new_node;
            head.next = head;
            return;
        }
        Node node = head;
        while(node.next != head){
            node = node.next;
        }
        new_node.next = head;
        node.next = new_node;
    }
    public void cllDeleteNode(int value){
        if(head == null) return;
        Node curr = head,prev = null;
        while (curr.data != value){
            if(curr.next == head){
                System.out.println("The given value " + value + " is not found in the circular linked list to be deleted.");
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        if(curr.next == head && prev == null){
            head = null;
        }
        else if(curr == head){
            Node temp = head;
            while(temp.next!=head){
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
        }else if(curr.next == head && prev!=null){
            prev.next = head;
        }else{
            prev.next = curr.next;
        }
    }
    public void cllDeleteList(){
        head = null;
    }
    public int getNodeCountHelper(Node node){
        if(node.next == head) return 0;
        return 1+getNodeCountHelper(node.next);
    }
    public int cllGetNodeCount(){
        return getNodeCountHelper(head);
    }
    public void cllReverseCircularLinkedList(){
        Node prev= null,curr = head,next = null;
        while (curr.next != head){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        Node last_node = head;
        while (last_node.next!=null){
            last_node = last_node.next;
        }
        last_node.next = head;
    }
    public Node cllLinkedListToCircularLinkedList(Node llhead){
        Node node = llhead;
        while (node.next != null){
            node = node.next;
        }
        node.next = llhead;
        return llhead;
    }
    public void cllPrintList(){
        if(head == null){
            System.out.println("The Circular linked list is empty!");
        }
        Node node = head;
        System.out.println("The Circular linked list is: ");

        do {
            System.out.print( node.data + " -> ");
            node = node.next;
        }while (node!=head);

        System.out.println();
    }
}
