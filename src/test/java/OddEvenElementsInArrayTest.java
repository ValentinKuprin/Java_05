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


    @Test
    public void testCreateOddEvenArray() {
        int[] arr = {2, 9, 34, 65, 99, 14, 22};
        int[][] expectedResult = {{2, 34, 14, 22},{9, 65, 99}};
        int[][] actualResult = new OddEvenElementsInArray().createOddEvenArray(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
