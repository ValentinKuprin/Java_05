import org.testng.Assert;
import org.testng.annotations.Test;

public class IntersectionTest {
    /** Test Data:
     {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
     {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
     {1, 2, 4, 5, 89}, {8, 9, 45} → {} */

    @Test
    public void testIntersection_1() {
         int[] arr1 = {1, 2, 4, 5, 89};
         int[] arr2 = {8, 9, 4, 2};
         int[] expectedResult = {2, 4};
         int[] actualResult = new Intersection().intersection(arr1, arr2);
         Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntersection_2() {
        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};
        int[] actualResult = new Intersection().intersection(arr1, arr2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntersection_3() {
        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, 45};
        int[] expectedResult = {};
        int[] actualResult = new Intersection().intersection(arr1, arr2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntersection_4() {
        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {1, 2, 4, 5, 5};
        int[] expectedResult = {1, 2, 4, 5, 5};
        int[] actualResult = new Intersection().intersection(arr1, arr2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntersection_5() {
        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {};
        int[] expectedResult = {};
        int[] actualResult = new Intersection().intersection(arr1, arr2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntersection_6() {
        int[] arr1 = {};
        int[] arr2 = {1, 2, 4, 5, 89};
        int[] expectedResult = {};
        int[] actualResult = new Intersection().intersection(arr1, arr2);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
