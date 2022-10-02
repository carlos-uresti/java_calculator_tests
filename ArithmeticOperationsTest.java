package Calculator;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {
    ArithmeticOperations arithmeticOperations;

    String[] string1 = {"5.0", "4.0", "+"};


    //Tests for method results()
    @Test
    void additionCorrectTest()
    {
        assertEquals("2.0", arithmeticOperations.result(new String[]{"1", "1", "+"},3));

    }

    @Test
    void additionIncorrectTest()
    {
        assertNotEquals("2.0", arithmeticOperations.result(new String[]{"1", "1", "*"},3));

    }

    @Test
    void subtractionCorrectTest()
    {

        assertEquals("0.0", arithmeticOperations.result(new String[]{"1", "1", "-"},3));

    }

    @Test
    void subtractionIncorrectTest()
    {

        assertNotEquals("0.0", arithmeticOperations.result(new String[]{"1", "1", "*"},3));

    }


    @Test
    void multiplicationCorrectTest()
    {
        assertEquals("4.0", arithmeticOperations.result(new String[]{"2", "2", "*"},3));

    }

    @Test
    void multiplicationIncorrectTest()
    {
        assertNotEquals("4.0", arithmeticOperations.result(new String[]{"2", "2", "÷"},3));

    }

    @Test
    void divisionCorrectTest()
    {
        assertEquals("1.0", arithmeticOperations.result(new String[]{"2", "2", "÷"},3));

    }

    @Test
    void divisionIncorrectTest()
    {
        assertNotEquals("1.0", arithmeticOperations.result(new String[]{"2", "2", "*"},3));

    }

    @Test
    void postfixArrayEmpty()
    {
        assertEquals("", arithmeticOperations.result(new String[]{},0));

    }

    @Test
    void postfixArrayNotEmpty()
    {
        assertNotEquals("", arithmeticOperations.result(new String[]{"0"},1));

    }

    @Test
    void postfixArraySizeZero()
    {
        assertEquals("", arithmeticOperations.result(new String[]{},0));

    }

    @Test
    void postfixArraySizeOne()
    {
        assertEquals("1", arithmeticOperations.result(new String[]{"1"},1));

    }

    @Test
    void postfixArraySizeGreaterThanOne()
    {
        assertEquals("2.0", arithmeticOperations.result(new String[]{"1", "1", "+"},3));

    }

    @Test
    void isPostfixArrayCountIntType()
    {
        assertEquals("4.0", arithmeticOperations.result(new String[]{"2", "2", "*"},3));
    }

    @Test
    void isPostfixArrayCountNotIntType()
    {
        assertNotEquals("", arithmeticOperations.result(new String[]{"2", "2", "*"}, Integer.parseInt("3")));
    }

    @Test
    void isPostFixArrayStringType()
    {
        assertEquals("4.0", arithmeticOperations.result(new String[]{"2", "2", "*"},3));
    }

    @Test
    void isPostFixArrayNotStringType()
    {
        assertNotEquals("", arithmeticOperations.result(new String[]{String.valueOf(2), String.valueOf(2), "+"},3));
    }

    @Test
    void postfixArrayCountEqualNull()
    {
        assertEquals("", arithmeticOperations.result(new String[]{}, null));
    }

    @Test
    void postfixArrayCountNotEqualNull()
    {
        assertNotEquals("", arithmeticOperations.result(new String[]{"2", "2", "*"}, 3));
    }

    @Test
    void postfixArrayEqualNull()
    {
        assertEquals("", arithmeticOperations.result(null, 0));
    }

    @Test
    void postfixArrayNotEqualNull()
    {
        assertNotEquals("", arithmeticOperations.result(new String[]{"2", "2", "*"}, 3));
    }

}
