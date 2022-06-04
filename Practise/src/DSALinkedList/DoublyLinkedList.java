package DSALinkedList;

public class DoublyLinkedList {
    DNode head = null;
    public void dllPush(int new_value){
        DNode new_node = new DNode(new_value);
        if(head == null){
            head = new_node;
            return;
        }
        new_node.next = head;
        head.prev = new_node;
        head = new_node;
    }
    public void dllInsertAfter(int index,int new_value){
        DNode prev = head;
        int i=1,size=dllGetNodeCount();
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
        if (prev == null){
            System.out.println("Previous node is null if the list is empty use the push method to insert the data.");
            return;
        }
        DNode new_node = new DNode(new_value);
        new_node.prev = prev;
        new_node.next = prev.next;
        prev.next = new_node;


        if (new_node.next != null){
            new_node.next.prev = new_node;
        }
    }
    public void dllAppend(int new_value){
        DNode new_node = new DNode(new_value);
        DNode last_node = head;
        if (head == null){
            head = new_node;
            return;
        }
        while (last_node.next != null){
            last_node = last_node.next;
        }
        new_node.prev = last_node;
        last_node.next = new_node;
    }
    public void dllDeleteNode(int value){
        if (head==null) return;

        DNode curr = head,prev=null;
        while (curr.data!=value && curr.next!=null){
            prev =curr;
            curr = curr.next;
        }
        if (curr.data != value){
            System.out.println("The given value "+ value + " is not in the doubly linked list.");
        }
        else if(curr == head && curr.next == null){
            head = null;
        }
        else if(curr == head && curr.next != null){
            head = head.next;
            head.prev = null;
        }
        else if(curr.next == null){
            prev.next = null;
        }
        else
        {
            prev.next = curr.next;
            curr.next.prev = prev;
        }
    }
    public void dllDeleteList(){
        head = null;
    }
    public int getNodeCountHelper(DNode node){
        if (node == null) return 0;
        return 1+getNodeCountHelper(node.next);
    }
    public int dllGetNodeCount(){
        return getNodeCountHelper(head);
    }
    public void dllReverseDoublyLinkedList(){
        DNode prev = null,curr = head,next = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void dllPrintList(){
        DNode node = head;
        System.out.println("The Doubly Linked list is: ");
        while (node != null){
            System.out.print( node.data + " -> ");
            node = node.next;
        }
        System.out.println();
    }
}
