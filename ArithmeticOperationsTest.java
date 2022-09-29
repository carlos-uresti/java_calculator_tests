package Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {
    ArithmeticOperations arithmeticOperations;

    String[] string1 = {"5.0", "4.0", "+"};
    String[] postFixString= {};
    String[] string2 = {"5.0", "+", "4.0"};


    @Test
    void isNumberTest()
    {
        assertEquals(true, arithmeticOperations.isNumber("5"));
    }

    @Test
    void isOperatorTest()
    {
        assertTrue(arithmeticOperations.isOperator("+"));
    }

    @Test
    void thePriorityTest()
    {
        assertEquals(1, arithmeticOperations.thePriority(")"));
    }

    @Test
    void theNumberIsADoubleTest()
    {
        assertEquals(true, arithmeticOperations.theNumberIsADouble("344.55555555") );
    }

    @Test
    void postFixStackTest()
    {
        assertEquals(3, arithmeticOperations.postfixStack(postFixString, string2,2));
    }

    @Test
    void resultTest()
    {
        assertEquals("9.0", arithmeticOperations.result(string1, 3));
    }

    @Test
    void isBigDecimalTest()
    {
        String string5 = "9.0E";
        assertTrue(arithmeticOperations.isBigDecimal(string5));

    }
}
