package ds.algo.mayank.prepare;

import java.util.HashMap;
import java.util.Map;

public class ArraySubsetOfAnother {
    public static void main(String[] args) {
        int[] arr = {11, 1, 13, 21, 3, 7};
        int[] subArr = {11, 3, 7, 1};

        Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        for(int i=0; i<arr.length; i++){
//            System.out.println(" array at " + i + " with value " + arr[i]);
            m.put(arr[i],i);
        }

        for(int i=0; i<subArr.length; i++){
            if(m.get(subArr[i]).equals(null)) {
                System.out.println("Not a subset");
                return;
            }
        }

        System.out.println("It is a subset");
    }
}
