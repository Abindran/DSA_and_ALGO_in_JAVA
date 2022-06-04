package DSALinkedList;

public class SinglyLinkedList {
    Node head = null;
    public void llPush(int new_value){
        Node new_node = new Node(new_value);
        if (head == null){
            head = new_node;
            return;
        }
        new_node.next = head;
        head = new_node;
    }
    public void llInsertAfter(int index,int new_value){
        Node prev = head;
        int i=1,size=llGetNodeCount();
        if(head == null){
            System.out.println("The linked list is empty!!");
            return;
        }
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
    public void llAppend(int new_value){
        Node new_node = new Node(new_value);
        Node last_node = head;
        while (last_node.next!=null){
            last_node = last_node.next;
        }
        last_node.next = new_node;
    }
    public void llDeleteNode(int new_value){
        if(head==null) return;

        Node node = head,prev=null;
        while(node.data != new_value && node.next!=null){
            prev = node;
            node = node.next;
        }
        if(node.data != new_value){
            System.out.println("The given value is not found to be deleted.");
            return;
        }
        else if(node == head && node.next == null){
            head = null;
        }
        else if(node == head && node.next!=null){
            head = head.next;
        }
        else if(node.next == null){
            prev.next = null;
        }else{
            prev.next = node.next;
        }
    }
    public void llDeleteList(){
        head = null;
    }
    public int getNodeCountHelper(Node node){
        if(node == null) return 0;
        return 1+getNodeCountHelper(node.next);
    }
    public int llGetNodeCount(){
        return getNodeCountHelper(head);
    }
    public void llReverseLinkedList(){
        Node prev=null,curr = head,next=null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public Node llCircularToLinkedList(Node cllhead){
        Node node = cllhead;
        if (cllhead == null) return null;
        while (node.next != cllhead){
            node = node.next;
        }
        node.next =null;
        return cllhead;
    }
    public void llPrintList(){
        Node node = head;
        if(head == null){
            System.out.println("The Linked list is empty.");
            return;
        }
        System.out.println("The Linked List is: ");
        while(node!=null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println();
    }
}
