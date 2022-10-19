import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {
    /** Проверьте работу метода на числах 555, 0 и -555. */

    @Test
    public void testIsPositiveNumberPositiveNumber() {
        int num = 555;
        Boolean expectedResult = true;
        Boolean actualResult = new IsPositiveNumber().isPositiveNumber(num);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIsPositiveNumberZero() {
        int num = 0;
        Boolean expectedResult = true;
        Boolean actualResult = new IsPositiveNumber().isPositiveNumber(num);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIsPositiveNumberNegativeNumber() {
        int num = -555;
        Boolean expectedResult = false;
        Boolean actualResult = new IsPositiveNumber().isPositiveNumber(num);
        Assert.assertEquals(actualResult, expectedResult);
    }

}
