import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {
    /**Test Data:
     3333, 9999
     Expected Result = 9999 */

    @Test
    public void testBiggerValue_HappyPath() {
         int num1 = 3333;
         int num2 = 9999;
         int expectedResult = 9999;
         int actualResult = new BiggerValue().biggerValue(num1, num2);
         Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testBiggerValue_Equals() {
        int num1 = 3333;
        int num2 = 3333;
        int expectedResult = 3333;
        int actualResult = new BiggerValue().biggerValue(num1, num2);
        Assert.assertEquals(actualResult, expectedResult);
    }


     }
