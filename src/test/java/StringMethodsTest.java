import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {
    /**      Test Data:
     “    Red Rover School   “ → “Лишние пробелы удалены”
     “Red Rover School“ → “Пробелов не было”
     “” → “Строка пустая” */

    @Test
    public void testStringMethods_SpaceInBeginAndEndOfString() {
        String str = "    Red Rover School   ";
        String expectedResult = "Лишние пробелы удалены";
        String actualResult = new StringMethods().removeSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringMethods_SpaceIsNotBeginAndEndOfString() {
        String str = "Red Rover School";
        String expectedResult = "Пробелов не было";
        String actualResult = new StringMethods().removeSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringMethods_StringIsEmpty() {
        String str = "";
        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().removeSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /**      Test Data:
     “    Red Rover School   “ →  “Red Rover School“
     “panda   “ → “pnd”
     “taramasalata” → “trmslt” */


}
