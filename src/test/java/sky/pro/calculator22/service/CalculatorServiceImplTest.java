package sky.pro.calculator22.service;

import org.junit.jupiter.api.Test;
import sky.pro.calculator22.Exception.ArithmeticException;
import sky.pro.calculator22.Service.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    @Test
    void plus_ShouldReturnPositiveNumberWhenNum1AndNum2ArePositive() {
        int num1 = 8;
        int num2 = 4;
        long sum = calculatorService.plus(num1, num2);
        assertEquals(num1+num2, sum);
    }

    @Test
    void plus_ShouldReturnNegativeWhenNumber1IsPositiveAndNumber2IsNegativeAndNumberTwoIsBiggerThenNumber1() {
        int num1 = 6;
        int num2 = -8;
        long sum = calculatorService.plus(num1, num2);
        assertEquals(num1 + num2, sum);
    }

    @Test
    void minus_ShouldReturnPositiveNumberWhenNum1AndNum2ArePositiveAndNum1AreBiggerThenNumber2() {
        int num1 = 8;
        int num2 = 4;
        long minus = calculatorService.minus(num1, num2);
        assertEquals(num1-num2,minus);

    }

    @Test
    void minus_ShouldReturnNegativeResultWhenNum1AndNum2ArePositiveAndNum2AreBiggerThenNumber1() {
        int num1 = 6;
        int num2 = 8;
        long minus = calculatorService.minus(num1, num2);
        assertEquals(num1-num2,minus);
    }

    @Test
    void multiply_ShouldReturnZeroWhenNumber1OrNumber2AreEqualsZero() {
        int num1 = 5;
        int num2 = 0;
        long multiply = calculatorService.multiply(num1, num2);
        assertEquals(num1*num2,multiply);

    }

    @Test
    void multiply_ShouldReturnNegativeResultWhenNum1OrNum2AreNegative() {
        int num1 = -9;
        int num2 = 10;

        long multiply = calculatorService.multiply(num1, num2);

        assertEquals(num1*num2,multiply);
    }

    @Test
    void divide_ShouldReturnPositiveResultWhenNumber1AndNumberTwoArePositive() {
        int num1 = 2;
        int num2 = 3;

        double divide = calculatorService.divide(num1, num2);

        assertEquals((double) num1/num2, divide);
    }

    @Test
    void divide_ShouldReturnNegativeResultWhenNum1OrNum2AreNegative() {
        int num1 = -8;
        int num2 = 4;

        double divide = calculatorService.divide(num1, num2);

        assertEquals((double) num1/num2,divide);

    }

    @Test
    void divide_ShouldThrowExceptionWhenNumber2IsEqualZero() {
        int num1 = -8;
        int num2 = 0;

       ArithmeticException result = assertThrows(sky.pro.calculator22.Exception.ArithmeticException.class,
               () -> calculatorService.divide(num1, num2));
       assertEquals("Делить на ноль нельзя!",result.getMessage());


    }
}