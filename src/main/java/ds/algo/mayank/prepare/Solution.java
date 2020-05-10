package ds.algo.mayank.prepare;

import java.awt.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    // Complete the cutTheSticks function below.

//    static  int secondLargest(int[] arr){
//        int max=0;
//
//        for (int i=0; i<arr.length; i++) {
//            if (max > arr[i])
//                max = arr[i];
//        }
//    int min=0;
//    for (int i; i<arr.length; i++) {
//        if(min<max-arr[i] && Math.abs(arr[i]-max)!=0)
//            min=arr[i]-max;
//
//    }
//    }

    static int[] cutTheSticks(int[] arr) {
        //sort
        Arrays.sort(arr);

        List<Integer> list = new ArrayList<Integer>();
        int i=0, j=arr.length;
        while(i<j){
            list.add(j-i);
            for(int x=i; x<j; x++){
                arr[x] = arr[x] - arr[i];
                if(arr[x+i]==0)
                    i++;

            }
            System.out.println("value of i: " + i);
        }
        int [] output = new int[list.size()];
        for (int a=0; a < list.size(); a++)
        {
            output[a] = list.get(a).intValue();
        }

        return output;
    }

//    5 4 4 2 2 8
    class Point1{
        int x,y,visit;
        Point1(int x,int y){
            this.x=x;
            this.y=y;
            this.visit=0;
        }
    }

   static List<Point1> list = new ArrayList<Point1>();

    private static boolean isConnected(Point1 p1, Point1 p2){
        if (Math.abs(p1.x-p2.x)==1 || Math.abs(p1.y-p2.y)==0)
            return true;
        else if (Math.abs(p1.x-p2.x)==0 || Math.abs(p1.y-p2.y)==1)
            return true;
        else if (Math.abs(p1.x-p2.x)==1 || Math.abs(p1.y-p2.y)==1)
            return true;
        else
            return false;
    }

    // Complete the connectedCell function below.
    static int connectedCell(int[][] matrix) {
        int area=0;
        Point1 curr;
        curr=list.get(0);
        Stack<Point1> s = new Stack<Point1>();
        s.push(curr);
        for (int i=1;i<list.size();i++){
            if(isConnected(curr,list.get(i))){
                curr=list.get(i);
                s.push(curr);
            }
        }
        return 0;
    }

    // Complete the jimOrders function below.
    static int getMinimumCost(int k, int[] c) {
        int n=0,sum=0,size=c.length;
        Arrays.sort(c);
        while(size>0){
            int numP = k;
            while(numP>0){
                sum += (n+1)*c[size-1];
                size--;
                if(size<1)
                    break;
                numP--;
            }
            n++;
        }
        return sum;
    }

    static int[] jimOrders(int[][] orders) {
        int [] b = new int[orders.length];
        int [] c = new int[orders.length];
        int [] output = new int[orders.length];
        for(int i=0; i<orders.length; i++){
            for (int j=0; j<1; j++){
                b[i] = c[i] = orders[i][j] + orders[i][j+1];
            }
        }



        Arrays.sort(c);

        for (int z=0; z<orders.length; z++){
            System.out.println("unsorted: " + b[z] + " sorted: " + c[z]);
        }


        for(int i=0; i<c.length ; i++){
            for(int j=0; j<b.length ; j++){
                if(c[i]==b[j]){
                    output[i]=j+1;
                    System.out.println(" value of j :" + j);
                    c[i]=-1;
                    b[j]=-2;
                }
            }
        }

        return  output;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] orders = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] ordersRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int ordersItem = Integer.parseInt(ordersRowItems[j]);
                orders[i][j] = ordersItem;
            }
        }

        int[] result = jimOrders(orders);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
