
class BSTNode{
    BSTNode left,right;
    int data;

    BSTNode(int n){
        left = null;
        right = null;
        data = n;
    }
}

class BST{
    private BSTNode root;
    BST(){
        root = null;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void insert(int data){
        root = insert(root,data);
    }
    private BSTNode insert(BSTNode node,int data){
        if(node==null){
            node = new BSTNode(data);
            return node;
        }
        if(data <= node.data){
            node.left = insert(node.left,data);
        }else{
            node.right = insert(node.right,data);
        }

        return node;
    }
    public boolean search(int data){
        BSTNode reqNode = search(root,data);
        if(reqNode == null) return false;
        if(reqNode.data == data){
            return true;
        }
        return false;
    }
//    private boolean search(BSTNode node,int data){
//        int cdata = node.data;
//        boolean found = false;
//        while(node!=null && !found){
//            if(data < cdata){
//                node = node.left;
//            }else if(data > cdata){
//                node = node.right;
//            }else{
//                found = true;
//                break;
//            }
//
//        }
//        return found;
//    }
    private BSTNode search(BSTNode node,int data){
        if(node==null || node.data==data) return node;

        if(data < node.data){
            return search(node.left,data);
        }
        return search(node.right,data);

    }
    public void delete(int data){
        root = delete(root,data);
    }
    public BSTNode delete(BSTNode node,int data){
        if(node == null) return node;
        if(data < node.data){
            node.left = delete(node.left,data);
        }else  if(data > node.data){
            node.right = delete(node.right,data);
        }else{
            if(node.left == null){
                return node.right;
            }
            if(node.right == null){
                return node.left;
            }
            node.data = inorder_successor(node.right);
            node.right = delete(node.right,node.data);
        }
        return node;
    }

    int inorder_successor(BSTNode node){
        int minData = node.data;
        while(node.left != null){
            minData = node.data;
            node = node.left;
        }
        return minData;
    }
    public void inorder(){
        inorder(root);
    }
    private void inorder(BSTNode node){
        if(node!=null){
            inorder(node.left);
            System.out.print(node.data + " - ");
            inorder(node.right);
        }
    }
    public void preorder(){
        preorder(root);
    }
    private void preorder(BSTNode node){
        if(node!=null){
            System.out.print(node.data + " - ");
            preorder(node.left);
            preorder(node.right);
        }
    }
    public void postorder(){
        postorder(root);
    }
    private void postorder(BSTNode node){
        if(node!=null){
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " - ");
        }
    }
}



public class BinarySearchTree {
    public static void main(String[] args) {
        BST tree1 = new BST();
        tree1.insert(8);
        tree1.insert(10);
        tree1.insert(5);
        tree1.insert(6);
        tree1.insert(7);
        tree1.inorder();
        System.out.println();
        tree1.postorder();
        System.out.println();
        tree1.preorder();
        tree1.delete(10);
        System.out.println();
        tree1.preorder();
        System.out.println( tree1.search(7));

    }
}
