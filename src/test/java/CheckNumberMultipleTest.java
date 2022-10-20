import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckNumberMultipleTest {
    /** Given an integer M perform the following conditional actions:
     * If M is multiple of 7 and 9 then return "Good Number".
     * If M is only multiple of 9 and not of 7  then return "Bad Number"
     * If M is only multiple of 11 then return "Poor Number"
     * If M doesn't satisfy any of the above conditions then return "-1"
     * Учитывая целое число M, выполните следующие условные действия:
     * Если M кратно 7 и 9, то верните "Хорошее число".
     * Если M кратно только 9, а не 7, то верните "Неверное число".
     * Если M кратно только 11, то верните "Плохое число".
     * Если M не удовлетворяет ни одному из вышеперечисленных условий, то верните "-1" */

    @Test
    public void testCheckNumberMultiple_Multiple9And7() {
        int m = 63;
        String expectedResult = "Good Number";
        String actualResult = new CheckNumberMultiple().checkNumberMultiple(m);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckNumberMultiple_Multiple9Not7() {
        int m = 18;
        String expectedResult = "Bad Number";
        String actualResult = new CheckNumberMultiple().checkNumberMultiple(m);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckNumberMultiple_Multiple11() {
        int m = 110;
        String expectedResult = "Poor Number";
        String actualResult = new CheckNumberMultiple().checkNumberMultiple(m);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCheckNumberMultiple_OtherNumbers() {
        int m = -7;
        String expectedResult = "-1";
        String actualResult = new CheckNumberMultiple().checkNumberMultiple(m);
        Assert.assertEquals(actualResult, expectedResult);
    }


}
