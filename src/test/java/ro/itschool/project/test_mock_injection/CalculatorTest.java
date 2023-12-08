package ro.itschool.project.test_mock_injection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.itschool.project.services.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void testAddition_ShouldFail_WithResultExceedingIntegerMaxValue() {
        //GIVEN
        int firstNumber = Integer.MAX_VALUE;
        int secondNumber = 1;
        long expectedResult = (long) firstNumber + secondNumber;

        //WHEN
        int result = calculator.add(firstNumber, secondNumber);
        System.out.println(firstNumber);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result: " + result);

        //THEN
        assertNotEquals(expectedResult, result);
    }


    @Test
    void testSubtract_ShouldPass_WithValidInput() {

        //GIVEN
        int firstNumber = 10;
        int secondNumber = 15;
        int expectedResult = firstNumber - secondNumber;

        //WHEN
        int result = calculator.subtract(firstNumber, secondNumber);


        //THEN
        assertEquals(expectedResult, result, "The subtract should be equal to the expected result");

    }
}