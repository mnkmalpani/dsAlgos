package ds.algo.mayank.prepare;

public class BinarySearchTree {

    class Node{
        int key;
        Node left,right;
        Node(int key){
            this.key=key;
            this.right=this.left=null;
        }
    }

    Node root;

    void insert(int key){
       insertNd(root, key);
    }

    Node insertNd(Node root,int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key>root.key){
           root.right = insertNd(root.right, key);
        }else{
            root.left = insertNd(root.left, key);
        }

        return root;
    }

    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree obj =  new BinarySearchTree();

        //insert
        obj.insert(10);
        obj.insert(7);
        obj.insert(15);
        obj.insert(5);
        obj.insert(9);
        obj.insert(13);
        obj.insert(17);

        inorder(obj.root);

    }
}
