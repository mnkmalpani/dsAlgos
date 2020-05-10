package ds.algo.mayank.prepare;

public class MiddleLinkedList {

    Llist head;

    class Llist{
        Llist next;
        int value;
        Llist(int m){
            value=5;
            next=null;
        }
    }

    private void push(int m){
        Llist new_node = new Llist(m);
        new_node.next=head;
        head=new_node.next;
    }

    public static void main(String[] args) {
        MiddleLinkedList obj = new MiddleLinkedList();

        for(int i =1;i<6;i++){
            obj.push(i);
            obj.printMiddle();
        }

    }

    private void printMiddle() {
        Llist fastPointer;
        Llist slowPointer;
        fastPointer = head;
        slowPointer = head;
        if(head != null) {
            while (fastPointer != null && fastPointer.next != null) {
                fastPointer = fastPointer.next.next;
                slowPointer = slowPointer.next;
            }

            System.out.println("Middle element is: " + slowPointer.value);
        }
    }
}
