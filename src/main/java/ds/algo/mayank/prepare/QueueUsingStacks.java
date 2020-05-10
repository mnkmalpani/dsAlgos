package ds.algo.mayank.prepare;

import java.util.*;

public class QueueUsingStacks {

   static Stack<Integer> stackForEnqueue = new Stack<Integer>();
    static Stack<Integer> stackForDequeue = new Stack<Integer>();

    public static void main(String[] args) {

        // in a while true loop

        QueueUsingStacks queueUsingStacks = new QueueUsingStacks();

        System.out.println(queueUsingStacks.toString());

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("use the following options to proceed (press) 1. enqueue 2. dequeue 3. print 4. exit : " );
            int input= sc.nextInt();
            sc.nextLine();
            int value = sc.nextInt();
            sc.nextLine();
            if(input==1){
                enqueue(value);
            }else if(input==2){
               try {
                   dequeue();
               }
               catch (Exception e){
                   System.out.println("Queue is empty please try to enqueue first");
                }
            }else if(input==3){
                printQueue();
            }else if(input==4){
                System.exit(0);
            }else {
                System.out.println("Wrong Input, exiting out");
                System.exit(0);
            }

//            if(args[])
        }

        // take the arguments 1. enqueue 2. dequeue 3. exit

        // call the specific method


    }

    private static void printQueue() {
//        while(!stackForEnqueue.isEmpty()){
//            stackForDequeue.push(stackForEnqueue.pop());
//        }
//        while (!stackForDequeue.isEmpty()){
//
//            String stackData = Arrays.toString(stackForDequeue.toArray());
//
//            System.out.println(stackData);
//        }

        String stackData = Arrays.toString(stackForEnqueue.toArray());

        System.out.println(stackData);
    }

    private static void dequeue() {

        if(!stackForDequeue.isEmpty()){
            stackForDequeue.pop();
        }else {

                while(!stackForEnqueue.isEmpty()){
                    stackForDequeue.push(stackForEnqueue.pop());
                }

            stackForDequeue.pop();
        }
    }

    private static void enqueue(int value) {
        stackForEnqueue.push(value);
    }

    @Override
    public String toString() {
        return Arrays.toString(stackForEnqueue.toArray());
    }
}
