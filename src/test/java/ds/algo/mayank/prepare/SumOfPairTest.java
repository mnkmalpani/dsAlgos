package ds.algo.mayank.prepare;

import ds.algo.mayank.prepare.SumOfPair;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SumOfPairTest {

    private SumOfPair sumOfPair;

    @Before
    public void setUp() {
        sumOfPair = new SumOfPair();
    }

    @Test
    public void emptyTest() {
        String data = "";

        boolean result = sumOfPair.isBalanced(data);
        
        assertEquals(true, result);
    }

    @Test
    public void singleValue1() {
        String data = "[";

        boolean result = sumOfPair.isBalanced(data);

        assertEquals(false, result);
    }

    @Test
    public void singlevalue2() {
        String data = ")";

        boolean result = sumOfPair.isBalanced(data);

        assertEquals(false, result);
    }

    @Test
    public void singleBracket() {
        String data = "[]";

        boolean result = sumOfPair.isBalanced(data);

        assertEquals(true, result);
    }

    @Test
    public void symmetricValuesBalanced() {
        String data = "[{()}]";

        boolean result = sumOfPair.isBalanced(data);

        assertEquals(true, result);
    }

    @Test
    public void unBalanced() {
        String data = "[{()}])";

        boolean result = sumOfPair.isBalanced(data);

        assertEquals(false, result);
    }

    @Test
    public void unbalanced2() {
        String data = "[({()}]";

        boolean result = sumOfPair.isBalanced(data);

        assertEquals(false, result);
    }

    @Test
    public void asysBalanced() {
        String data = "[()]{}{[()()]()}";

        boolean result = sumOfPair.isBalanced(data);

        assertEquals(true, result);
    }

    @Test
    public void asysUnbalanced() {
        String data = "[()]{}{[()()]())}";

        boolean result = sumOfPair.isBalanced(data);

        assertEquals(false, result);
    }

    @Test
    public void asysUnbal2() {
        String data = "[()]{}{{[()()]()}";

        boolean result = sumOfPair.isBalanced(data);

        assertEquals(false, result);
    }

    @Test
    public void abnormal() {
        String data = "[abc]";

        boolean result = sumOfPair.isBalanced(data);

        assertEquals(true, result);
    }

//    @Test
//    public void custom1() {
//
//        Map customParenthesis = mapOf(Pair('x', 'y'));
//
//        sumOfPair = sumOfPair(customParenthesis)
//
//        String data = "[xyxy]"
//
//        boolean result = sumOfPair.isBalanced(data);
//
//        assertEquals(true, result);
//    }

//    @Test
//    public void `Custom Parenthesis Test - Balanced - 2`() {
//
//        val customParenthesis = mapOf(Pair('x', 'y'), Pair('a', 'b'))
//
//        sumOfPair = sumOfPair(customParenthesis)
//
//        String data = "[xyaxybaabbc]"
//
//        boolean result = sumOfPair.isBalanced(data);
//
//        assertEquals(true, result);
//    }
//
//    @Test
//    public void `Custom Parenthesis Test - Unbalanced - 1`() {
//
//        val customParenthesis = mapOf(Pair('x', 'y'))
//
//        sumOfPair = sumOfPair(customParenthesis)
//
//        String data = "[xyxxy]"
//
//        boolean result = sumOfPair.isBalanced(data);
//
//        assertEquals(false, result);
//    }
//
//    @Test
//    public void `Custom Parenthesis Test - Unbalanced - 2`() {
//
//        val customParenthesis = mapOf(Pair('x', 'y'), Pair('a', 'b'))
//
//        sumOfPair = sumOfPair(customParenthesis)
//
//        String data = "[xyaxy]"
//
//        boolean result = sumOfPair.isBalanced(data);
//
//        assertEquals(false, result);
//    }
//
//    @Test
//    public void `Custom Parenthesis Test - Unbalanced - 3`() {
//
//        val customParenthesis = mapOf(Pair('x', 'y'))
//
//        sumOfPair = sumOfPair(customParenthesis)
//
//        String data = "[xy{xy]"
//
//        boolean result = sumOfPair.isBalanced(data);
//
//        assertEquals(false, result);
//    }
//
//    @Test
//    public void `Alphanumeric Value Test - Balanced - 1`() {
//        String data = "[1+2]"
//
//        boolean result = sumOfPair.isBalanced(data);
//
//        assertEquals(true, result);
//    }
//
//    @Test
//    public void `Alphanumeric Value Test - Balanced - 2`() {
//        String data = "[(7+2)*4]-{4*2}"
//
//        boolean result = sumOfPair.isBalanced(data);
//
//        assertEquals(true, result);
//    }
//
//    @Test
//    public void `Alphanumeric Value Test - Unbalanced - 1`() {
//        String data = "[(7+2)*4}]-{4*2}"
//
//        boolean result = sumOfPair.isBalanced(data);
//
//        assertEquals(false, result);
//    }
//
//    @Test
//    public void `Alphanumeric Value Test - Unbalanced - 2`() {
//        String data = "[((7+2)*4}]-{4*2}"
//
//        boolean result = sumOfPair.isBalanced(data);
//
//        assertEquals(false, result);
//    }
}