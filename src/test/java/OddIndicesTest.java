import org.testng.Assert;
import org.testng.annotations.Test;

/**      Test Data:
 Input = {-45, 590, 234, 985, 12, 68}
 Expected Result =  {590, 985, 68}   */

public class OddIndicesTest {

    @Test
    public void testOddIndices() {
        int[] arr = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        int[] actualResult = new OddIndices().oddIndices(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testOddIndicesZero() {
        int[] arr = {};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
