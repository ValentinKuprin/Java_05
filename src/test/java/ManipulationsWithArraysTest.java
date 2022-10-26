import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    @Test
    public void testGetTheGreaterHalf_RightPartMore() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] expectedResult = {6, 5, 4};
        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalf_LeftPartMore() {
        int[] arr = {22, 12, 13, 14, 15, 16};
        int[] expectedResult = {22, 12, 13};
        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalf_LeftPartEqualsRight() {
        int[] arr = {22, 12, 13, 21, 13, 13};
        int[] expectedResult = {13, 13, 21};
        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalf_ArrayIsEmpty() {
        int[] arr = {};
        int[] expectedResult = {};
        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
