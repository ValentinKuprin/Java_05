import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberOccurrencesTest {
    /**  Test Data:
    //{3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1} →
    //{{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}} */
    @Test
    public void testNumberOccurrences() {
        int[] arr = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
        int[][] expectedResult = {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};
        int[][] actualResult = new NumberOccurrences().numberOccurrences(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
