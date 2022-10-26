import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {
    /**
     * Test Data:
     * “    Red Rover School   “ → “Лишние пробелы удалены”
     * “Red Rover School“ → “Пробелов не было”
     * “” → “Строка пустая”
     */

    @Test
    public void testStringMethods_TrimSpaceInBeginAndEndOfString() {
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


    /**
     * Test Data:
     * “    Red Rover School   “ →  “Red Rover School“
     * “panda   “ → “pnd”
     * “taramasalata” → “trmslt”
     */

    @Test
    public void testremoveAllAs_TrimSpacesInBeginAndEndOfString() {
        String str = "    Red Rover School   ";
        String expectedResult = "Red Rover School";
        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testremoveAllAs_TrimSpaceAndRemoveALetters() {
        String str = "panda   ";
        String expectedResult = "pnd";
        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testremoveAllAs_RemoveALetters() {
        String str = "taramasalata";
        String expectedResult = "trmslt";
        String actualResult = new StringMethods().removeAllAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Test Data:
     * “3504209706040000 “ →  “35429764“
     * “0000000111“ → “111”
     */

    @Test
    public void testRemoveAllZeros_TrimSpaceAndRemoveZeros() {
        String str = "3504209706040000 ";
        String expectedResult = "35429764";
        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllZeros_RemoveZeros() {
        String str = "0000000111";
        String expectedResult = "111";
        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllZeros_NotSpacesAndZeros() {
        String str = "111";
        String expectedResult = "This is a valid string";
        String actualResult = new StringMethods().removeAllZeros(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Test Data:
     * “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
     * “p a     n   d a   “ → “panda”
     */

    @Test
    public void testRemoveAllSpaces_SpaceInBeginMiddleEnd() {
        String str = "    R e d     Ro ve    r Sc   h ool   ";
        String expectedResult = "RedRoverSchool";
        String actualResult = new StringMethods().removeAllSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllSpaces_SpaceInMiddleEnd() {
        String str = "p a     n   d a   ";
        String expectedResult = "panda";
        String actualResult = new StringMethods().removeAllSpaces(str);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /**
     * Test Data:
     * “Abracadabra” → “5, 6”
     * “Homenum Revelio” → “0, 15”
     * “3 tarAmasAlatA” → “6, 8”
     */

    @Test
    public void testCountAs_() {
        String str = "Abracadabra";
        String expectedResult = "5, 6";
        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAs__() {
        String str = "Homenum Revelio";
        String expectedResult = "0, 15";
        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAs____() {
        String str = "3 tarAmasAlatA";
        String expectedResult = "6, 8";
        String actualResult = new StringMethods().countAs(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Test Data:
     * “As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS) versions.
     * Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial use,
     * although it will otherwise still support Java 8 with public updates for personal use indefinitely. Other vendors have begun
     * to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.” → true
     * <p>
     * “99 little bugs in a code.
     * 99 little bugs in a code.
     * Take one down, and patch it around.
     * 235 critical bugs in the code.” → false
     */

    @Test
    public void testCountJava_Contains_Java() {
        String str = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term " +
                "support (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS " +
                "in January 2019 for commercial use, although it will otherwise still support Java 8 with public updates for" +
                " personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are" +
                " still receiving security and other upgrades.";
        Boolean expected = true;
        Boolean actualResult = new StringMethods().countJava(str);

        Assert.assertEquals(actualResult, expected);
    }

    @Test
    public void testCountJava_NotContains_Java() {
        String str = "99 little bugs in a code.\n" +
                "     99 little bugs in a code.\n" +
                "     Take one down, and patch it around.\n" +
                "     235 critical bugs in the code.";
        Boolean expected = false;
        Boolean actualResult = new StringMethods().countJava(str);

        Assert.assertEquals(actualResult, expected);
    }

    @Test
    public void testCountJava_Contains_JavaLowerCase() {
        String str = "As of March 2022, java 18 is the latest version, while java 17, 11 and 8 are the current long-term " +
                "support (LTS) versions. Oracle released the last zero-cost public update for the legacy version java 8 LTS " +
                "in January 2019 for commercial use, although it will otherwise still support java 8 with public updates for" +
                " personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are" +
                " still receiving security and other upgrades.";
        Boolean expected = false;
        Boolean actualResult = new StringMethods().countJava(str);

        Assert.assertEquals(actualResult, expected);
    }

    /**
     * Test Data:
     * “Abracadabra” →  ““Abracadabra””
     */
    @Test
    public void testInsertQuotes() {
        String str = "Abracadabra";
        String expectedResult = "\"Abracadabra\"";
        String actualResult = new StringMethods().insertQuotes(str);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /**
     * Test Data:
     * “ташкент” → “Ташкент”
     * “ЧикаГО” → “Чикаго”
     */
    @Test
    public void testCorrectCityName_BeginLetterLowCase() {
        String str = "ташкент";
        String expectedResult = "Ташкент";
        String actualResult = new StringMethods().correctCityName(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCorrectCityName_FirstLetterAndLastLettersUpperCase() {
        String str = "ЧикаГО";
        String expectedResult = "Чикаго";
        String actualResult = new StringMethods().correctCityName(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Test Data:
     * “Abracadabra”, “b” → “bracadab”
     * “Whippersnapper”, “p” → “ppersnapp”
     */
    @Test
    public void testWordBetweenLetter() {
        String str = "Abracadabra";
        char letter = 'b';
        String expectedResult = "bracadab";
        String actualResult = new StringMethods().wordBetweenLetter(str, letter);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testWordBetweenLetter_() {
        String str = "Whippersnapper";
        char letter = 'p';
        String expectedResult = "ppersnapp";
        String actualResult = new StringMethods().wordBetweenLetter(str, letter);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Test Data:
     * “Abracadabra” → true
     * “Whippersnapper” → false
     */
    @Test
    public void testFirstAndLastLetterTheSame_FirstLetterUpperCase() {
        String str = "Abracadabra";
        boolean expectedResult = true;
        boolean actualResult = new StringMethods().firstAndLastLetterTheSame(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFirstAndLastLetterTheSame_NegativeFirstAndLastLetterDifferent() {
        String str = "Whippersnapper";
        boolean expectedResult = false;
        boolean actualResult = new StringMethods().firstAndLastLetterTheSame(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Test Data:
     * “Red Rover” → “Rover”
     */
    @Test
    public void testReturnLastWord() {
        String str = "Red Rover";
        String expectedResult = "Rover";
        String actualResult = new StringMethods().returnLastWord(str);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * “Red rover”, 1, 4 → “Rover”
     */
    @Test
    public void testRemoveBetweenTwoIndexes() {
        String str = "Red rover";
        int index1 = 1;
        int index2 = 4;
        String expectedResult = "Rover";
        String actualResult = new StringMethods().removeBetweenTwoIndexes(str, index1, index2);

        Assert.assertEquals(actualResult, expectedResult);
    }


}
