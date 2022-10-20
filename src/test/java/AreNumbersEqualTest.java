import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {
    /** Test Data:
     89, 89
     Expected result: 0
     -89, 89
     Expected result: -1
     89, -89
     Expected result: 1 */

    @Test
    public void testAreNumbersEqual_Equals() {
        int num1 = 89;
        int num2 = 89;
        int expectedResult = 0;
        int actualResult = new AreNumbersEqual().areNumbersEqual(num1, num2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAreNumbersEqual_Number1LessNumber2() {
        int num1 = -89;
        int num2 = 89;
        int expectedResult = -1;
        int actualResult = new AreNumbersEqual().areNumbersEqual(num1, num2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAreNumbersEqual_Number1MoreNumber2() {
        int num1 = 89;
        int num2 = -89;
        int expectedResult = 1;
        int actualResult = new AreNumbersEqual().areNumbersEqual(num1, num2);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
