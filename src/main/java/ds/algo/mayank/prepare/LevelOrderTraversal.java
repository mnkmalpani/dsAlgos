package ds.algo.mayank.prepare;


class Node {
    int data;
    Node right;
    Node left;

    Node(int value){
        this.data=value;
        this.left=this.right=null;
    }
}

public class LevelOrderTraversal {

    Node root;

    void LevelOrderTraversal(){
        root=null;
    }

    void levelOrder(Node root){

        int h = height(root);
        int i;
        System.out.println("Height of the tree is "+ h);
        for(i=1;i<=h;i++)
            printLevelOrder(root, i);
    }

    private void printLevelOrder(Node root, int level) {

        // base case

        if(root == null)
            return;

        if(level == 1) {
            System.out.print(root.data);
        }

        if (level > 1)
        {
            printLevelOrder(root.left, level-1);
            printLevelOrder(root.right, level-1);

        }



    }

    private int height(Node root) {

        if (root == null)
            return 0;

        int result=0;


        int hLeftTree = height(root.left) + 1;
        int hRightTree = height(root.right) + 1;

        if(hLeftTree > hRightTree)
            result = hLeftTree;
        else
            result = hRightTree;

        return result;
    }

    public static void main(String[] args) {

        LevelOrderTraversal obj = new LevelOrderTraversal();
        obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.left = new Node(4);
        obj.root.left.right = new Node(5);
        obj.levelOrder(obj.root);


    }
}
