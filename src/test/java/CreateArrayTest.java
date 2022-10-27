import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {
    /**
     * (н-р, “3 4 1 8 10 12.3”)  */ //TODO; написать тест !


    /** Например, multiplesOf(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20} */
    @Test
    public void testMultiplesOf_2() {
        int number = 3;
        int[] expectedResult = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] actualResult = new CreateArray().multiplesOf(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultiplesOf_3() {
        int number = 3;
        int[] expectedResult = {0, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int[] actualResult = new CreateArray().multiplesOf(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultiplesOf_NegativeDate() {
        int number = 11;
        int[] expectedResult = {};
        int[] actualResult = new CreateArray().multiplesOf(number);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
