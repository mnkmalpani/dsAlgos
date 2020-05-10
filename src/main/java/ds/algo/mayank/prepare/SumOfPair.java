package ds.algo.mayank.prepare;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Stack;

public class SumOfPair {

    private static String sampleData = "[]";
    private Stack stack = new Stack<Character>();
    private static HashMap<Character, Character> hashMap = new HashMap<Character, Character>();


    public static void main(String[] args) {

        SumOfPair obj = new SumOfPair();
        if (obj.isBalanced(sampleData)) System.out.println("balanced");
        else System.out.println("not balance");

    }

    // take the data and send it to the logic

    public boolean isBalanced(String data) {
        int i;
        hashMap.put('[', ']');
        hashMap.put('{', '}');
        hashMap.put('(', ')');
        //traverse to push and pop
        for (i = 0; i < data.length(); i++) {
//            System.out.println("stack content before :" + stack.toString());

            if (hashMap.keySet().contains(data.charAt(i))) {
                stack.push(data.charAt(i));
            } else {
                try {
                    if (data.charAt(i) != hashMap.get((Character) stack.pop())) {
                        return false;
                    }
                } catch (Exception e) {
                    return false;
                }
            }
//            System.out.println("stack content :" + stack.toString());
//            System.out.println("string content :" + data.charAt(i));
        }


        return stack.empty();


    }
}
