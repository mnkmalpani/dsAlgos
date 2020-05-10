package ds.algo.mayank.prepare;

public class RandomLinkedList {


    class Node{
        int key;
        Node rand;
        Node next;

        Node(int key){
            this.key=key;
            this.rand=null;
            this.next=null;
        }
    }

    Node head;

    void insert(int key){
        insertNd(key);
    }

    private void insertNd(int key) {
            Node node = new Node(key);
            node.next = head;
            head = node;
    }

    public static void main(String[] args) {
        RandomLinkedList rd = new RandomLinkedList();
        rd.insert(5);
        rd.insert(6);
        rd.insert(2);
        rd.insert(10);
        rd.insert(20);
//        System.out.println(rd.head.key);

        rd.printLinkedList();
    }

    private void printLinkedList() {
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.key);
            temp=temp.next;
        }
    }
}
