package ds.algo.mayank.prepare;

public class PrintOddEvenArray {

    static int[] data = {2,4,6,8,10,12,14,16};


    public static void main(String[] args) {
        printArray(data);
    }

    private static void printArray(int[] data) {
        // take size
        int size=data.length;
        //take even, odd and print pointer
        int even,odd, print;
        // assign
        print = size/2;
        odd = print - 1; even = print + 1;
        if(size==1)
        {
            System.out.println(data[0]);
            return;
        }

        for(int i=0; i < size; i++){
            System.out.println(data[print]);
            //even logic
            if(data[print]%2==0){
                if (even < size && even > size/2){
                    print=even;
                    even += 1;
                }
                else{
//                    even=0;
//                    print=even;
//                    even += 1;
                    print=odd;
                    odd -= 1;
                }
            }
            else{ //odd logic
//                if(odd >= 0){
                if(odd >= 0 && odd < size/2){
                    print=odd;
                    odd -= 1;
                }
                else{
//                    odd = size-1;
//                    print=odd;
//                    odd -= 1;
                    print=even;
                    even += 1;
                }
            }
        }

    }
}
