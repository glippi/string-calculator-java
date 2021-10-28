package stringcalculator;

import org.junit.Test;
import org.junit.Assert;

public class StringCalculatorTest {
    private StringCalculatorProvider stringCalculator;

    // Format for name convention in unit-test methods:
    // public void Application_method_input_output()

    // Case 1 & 2:
    @Test
    public void StringCalculator_Add_NumberString_ReturnesSumOfIntegers(){

        // Setup-part:
        String[] testValues = {"","1","1,2,3"};

        // Expected results:
        int[] expectedValues = {0,1,6};

        // Arrange-part:
        stringCalculator = new StringCalculatorProvider();
        int[] actualValues = {stringCalculator.add(testValues[0]),
                stringCalculator.add(testValues[1]),
                stringCalculator.add(testValues[2])};

        // Assert-part:
        Assert.assertArrayEquals(expectedValues,actualValues);

    }

    // TODO: Implementer enhetstest for case 3
    @Test
    public void StringCalculator_Add_NumberStringWithNewLine_ReturnsSumOfIntegers(){
        // Case3: "1\n2,3" add => 6

        String testValue = "1\n2,3";
        int expectedValue = 6;  //result

        stringCalculator = new StringCalculatorProvider();

        int actualValue = stringCalculator.add(testValue);

        Assert.assertEquals(expectedValue,actualValue);

    }

    // TODO: lag navn på enhetstest og implementer test for case 4
    @Test
    public void case4() {
        // case4: "//[delimiter]\n[numbers…]"
        int expectedValue = 0;
        int actualValue = 1;

        Assert.assertEquals(expectedValue,actualValue);
    }

    // TODO: lag navn på enhetstest og implementer test for case 5
    @Test
    public void case5() {
        // case5: Calling Add with a negative number will throw an exception “negatives not allowed”
        int expectedValue = 0;
        int actualValue = 1;

        Assert.assertEquals(expectedValue,actualValue);
    }

    // TODO: lag navn på enhetstest og implementer test for case 6
    @Test
    public void case6() {
        // case6: Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2
        int expectedValue = 0;
        int actualValue = 1;

        Assert.assertEquals(expectedValue,actualValue);
    }

}

