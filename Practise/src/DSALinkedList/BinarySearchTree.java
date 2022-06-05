package DSALinkedList;
class BSTNode{
    int data;
    BSTNode left,right;
    BSTNode(int n){
        data = n;
        left = null;
        right = null;
    }
}
class BST{
    private BSTNode root;
    BST(){ root = null;}

    public boolean isEmpty(){return root==null;}

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

    public boolean search(int key){
        if(search(root,key) == null) return false;
        return true;
    }
//    private boolean search(BSTNode node,int data){
//        if(node==null){return false;}
//        boolean found = false;
//        while(node!=null && !found){
//            if(data < node.data){
//                node = node.left;
//            }else if(data > node.data){
//                node = node.right;
//            }else{
//                found = true;
//                break;
//            }
//        }
//
//        return found;
//    }
    private BSTNode search(BSTNode node,int data){
        if(node==null || node.data == data) return node;

        if(data < node.data){
            return search(node.left,data);
        }
        return search(node.right,data);
    }
    public void delete(int data){
        root = delete(root,data);
    }
    private BSTNode delete(BSTNode node,int data){
        if(node == null){ return node;}

        if(data < node.data){
            node.left = delete(node.left,data);
        }else if(data > node.data){
            node.right = delete(node.right,data);
        }else{
            if(node.left == null){
                return node.right;
            }
            if(node.right == null){
                return node.left;
            }
            node.data = inorder_sucessor(node.right);
            node.right = delete(node.right,node.data);
        }
        return node;
    }
    private int inorder_sucessor(BSTNode node){
        int minval = node.data;
        while(node.left!=null){
            minval = node.data;
            node=node.left;
        }
        return minval;
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
}
public class BinarySearchTree {
    public static void main(String[] args) {

    }
}
