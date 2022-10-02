package Calculator;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {
    ArithmeticOperations arithmeticOperations;

    String[] string1 = {"5.0", "4.0", "+"};


    //Tests for method results()
    @Test
    void additionCorrectTest1()
    {
        assertEquals("2.0", arithmeticOperations.result(new String[]{"1", "1", "+"},3));

    }

    @Test
    void additionIncorrectTest2()
    {
        assertNotEquals("2.0", arithmeticOperations.result(new String[]{"1", "1", "*"},3));

    }

    @Test
    void subtractionCorrectTest3()
    {

        assertEquals("0.0", arithmeticOperations.result(new String[]{"1", "1", "-"},3));

    }

    @Test
    void subtractionIncorrectTest4()
    {

        assertNotEquals("0.0", arithmeticOperations.result(new String[]{"1", "1", "*"},3));

    }


    @Test
    void multiplicationCorrectTest5()
    {
        assertEquals("4.0", arithmeticOperations.result(new String[]{"2", "2", "*"},3));

    }

    @Test
    void multiplicationIncorrectTest6()
    {
        assertNotEquals("4.0", arithmeticOperations.result(new String[]{"2", "2", "÷"},3));

    }

    @Test
    void divisionCorrectTest7()
    {
        assertEquals("1.0", arithmeticOperations.result(new String[]{"2", "2", "÷"},3));

    }

    @Test
    void divisionIncorrectTest8()
    {
        assertNotEquals("1.0", arithmeticOperations.result(new String[]{"2", "2", "*"},3));

    }

    @Test
    void postfixArrayEmptyTest9()
    {
        assertEquals("", arithmeticOperations.result(new String[]{},0));

    }

    @Test
    void postfixArrayNotEmptyTest10()
    {
        assertNotEquals("", arithmeticOperations.result(new String[]{"0"},1));

    }

    @Test
    void postfixArraySizeZeroTest11()
    {
        assertEquals("", arithmeticOperations.result(new String[]{},0));

    }

    @Test
    void postfixArraySizeOneTest12()
    {
        assertEquals("1", arithmeticOperations.result(new String[]{"1"},1));

    }

    @Test
    void postfixArraySizeGreaterThanOneTest13()
    {
        assertEquals("2.0", arithmeticOperations.result(new String[]{"1", "1", "+"},3));

    }

    @Test
    void isPostfixArrayCountIntTypeTest14()
    {
        assertEquals("4.0", arithmeticOperations.result(new String[]{"2", "2", "*"},3));
    }

    @Test
    void isPostfixArrayCountNotIntTypeTest15()
    {
        assertNotEquals("", arithmeticOperations.result(new String[]{"2", "2", "*"}, Integer.parseInt("3")));
    }

    @Test
    void isPostFixArrayStringTypeTest16()
    {
        assertEquals("4.0", arithmeticOperations.result(new String[]{"2", "2", "*"},3));
    }

    @Test
    void isPostFixArrayNotStringTypeTest17()
    {
        assertNotEquals("", arithmeticOperations.result(new String[]{String.valueOf(2), String.valueOf(2), "+"},3));
    }

    @Test
    void postfixArrayCountEqualNullTest18()
    {
        assertEquals("", arithmeticOperations.result(new String[]{}, null));
    }

    @Test
    void postfixArrayCountNotEqualNullTest19()
    {
        assertNotEquals("", arithmeticOperations.result(new String[]{"2", "2", "*"}, 3));
    }

    @Test
    void postfixArrayEqualNullTest20()
    {
        assertEquals("", arithmeticOperations.result(null, 0));
    }

    @Test
    void postfixArrayNotEqualNullTest21()
    {
        assertNotEquals("", arithmeticOperations.result(new String[]{"2", "2", "*"}, 3));
    }

}
