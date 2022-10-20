import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeOnTheRightTest {
    /** Test Data:
     {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}   */

    @Test
    public void testNegativeOnTheRight() {
        int[] arr = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};
        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegativeOnTheRight_ContainsZero() {
        int[] arr = {4, -3, 7, -12, 5, 0, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 0, 9, 4, 12, -3, -12, -2};
        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

}
