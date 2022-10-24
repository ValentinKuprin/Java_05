import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenElementsInArrayTest {

    @Test
    public void testOddEvenElementsInArray() {
        int[] arr = {2, 5, 6, 99, 55, 66};
        int[] expected = {3, 3};
        int[] actualResult = new OddEvenElementsInArray().countOddEvenValuesInArray(arr);
        Assert.assertEquals(actualResult, expected);
    }
}
