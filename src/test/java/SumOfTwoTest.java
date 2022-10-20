import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfTwoTest {
    /** ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}} */

    @Test
    public void testSumOfTwo() {
        int[] arr = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};
        int[][] actualResult = new SumOfTwo().sumOfTwo(arr, n);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
