package ds.algo.mayank.prepare;

public class ReverseLinkedList {

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head;

    private void insert(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    private void printLinkedList(Node head){
        Node point = head;
        while(point!=null){
            System.out.println(point.data);
            point=point.next;
        }
    }

    private void reverseTheList(){
        Node prev,curr,next;
        prev = head; curr = next = head.next;

        while(next!=null){
            next=next.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;
    }

    public static void main(String[] args) {
        ReverseLinkedList rs = new ReverseLinkedList();
        rs.insert(2);
        rs.insert(5);
        rs.insert(9);
//        rs.insert(4);
//        rs.insert(1);
//        rs.insert(7);

        rs.printLinkedList(rs.head);

        rs.reverseTheList();

        rs.printLinkedList(rs.head);


    } 
}
