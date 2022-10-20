import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArrayTest {
    /** Test Data:
     {2, 7, 3, 10} → {10, 3, 7, 2} */

    @Test
    public void testReverseArray() {
        int[] arr = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};
        int[] actualResult = new ReverseArray().reverseArray(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

}
