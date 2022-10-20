import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {
    /**     Test Data:
     ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5} */

    @Test
    public void testMinMaxAveIndex1LessIndex2() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;
        double[] expectedResult = {3, 7, 5};
        double[] actualResult = new MinMaxAve().minMaxAve(arr, index1, index2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinMaxAveIndex1MoreIndex2() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 6;
        int index2 = 2;
        double[] expectedResult = {3, 7, 5};
        double[] actualResult = new MinMaxAve().minMaxAve(arr, index1, index2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinMaxAveIndex1EqualIndex2() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 2;
        double[] expectedResult = {3.0, 3.0, 3.0};
        double[] actualResult = new MinMaxAve().minMaxAve(arr, index1, index2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinMaxAve_ArrayIsNull() {
        int[] arr = {};
        int index1 = 2;
        int index2 = 2;
        double[] expectedResult = {};
        double[] actualResult = new MinMaxAve().minMaxAve(arr, index1, index2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinMaxAve_Index1MoreArrayLength() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 10;
        int index2 = 2;
        double[] expectedResult = {};
        double[] actualResult = new MinMaxAve().minMaxAve(arr, index1, index2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinMaxAve_Index2MoreArrayLength() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 20;
        double[] expectedResult = {};
        double[] actualResult = new MinMaxAve().minMaxAve(arr, index1, index2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinMaxAve_Index1LessArrayLength() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = -2;
        int index2 = 2;
        double[] expectedResult = {};
        double[] actualResult = new MinMaxAve().minMaxAve(arr, index1, index2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinMaxAve_Index2LessArrayLength() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = -2;
        double[] expectedResult = {};
        double[] actualResult = new MinMaxAve().minMaxAve(arr, index1, index2);
        Assert.assertEquals(actualResult, expectedResult);
    }


}
