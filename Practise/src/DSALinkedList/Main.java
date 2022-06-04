package DSALinkedList;

public class Main {
    public static void main(String[] args){
        SinglyLinkedList llist = new SinglyLinkedList();
//        llist.llPush(2);
//        llist.llPush(2);
//        llist.llPush(1);
//        llist.llPush(0);
//        llist.llAppend(4);
//        llist.llInsertAfter(2,3);
//        llist.llDeleteNode(2);
//        llist.llPrintList();
//        llist.llReverseLinkedList();
//        llist.llPrintList();
//        llist.llDeleteList();
//        CircularLinkedList cllist = new CircularLinkedList();
//        cllist.cllAppend(1);
//        cllist.cllAppend(2);
//        cllist.cllAppend(3);
//        cllist.cllAppend(4);
//        cllist.cllPush(0);
//        cllist.cllPrintList();
//        llist.head = llist.llCircularToLinkedList(cllist.head);
//        llist.llPrintList();
//        cllist.cllDeleteNode(2);
//        cllist.cllReverseCircularLinkedList();
//        cllist.cllPrintList();
        DoublyLinkedList dllist = new DoublyLinkedList();
        dllist.dllPush(5);
        dllist.dllPush(4);
        dllist.dllPush(3);
        dllist.dllPush(2);
        dllist.dllPush(1);
        dllist.dllAppend(0);
        dllist.dllPrintList();
    }
}
