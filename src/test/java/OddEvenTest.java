import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {
    /**      Test Data:
     -345 →  “Odd”
     0 →  “Even”
     222222 →  “Even”   */

    @Test
    public void testOddEven_Even_HappyPath() {
        int num = 222222;
        String expectedResult = "Even";
        String actualResult = new OddEven().oddEven(num);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testOddEven_Odd_HappyPath() {
        int num = -345;
        String expectedResult = "Odd";
        String actualResult = new OddEven().oddEven(num);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testOddEven_ZeroNumber_HappyPath() {
        int num = 0;
        String expectedResult = "Even";
        String actualResult = new OddEven().oddEven(num);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
