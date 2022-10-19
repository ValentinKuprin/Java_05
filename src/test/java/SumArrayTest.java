import org.testng.Assert;
import org.testng.annotations.Test;

/** Test Data:
 {0, 1, 2, 3, 4, 5} → 15
 {-7, -3} → -10  */

 public class SumArrayTest {

     @Test
     public void testSumArrayEvenNumbers_HappyPath() {
         int[] arr = {0, 1, 2, 3, 4, 5};
         int expectedResult = 15;

         int actualResult = new SumArray().sumArray(arr);
         Assert.assertEquals(actualResult, expectedResult);
     }

     @Test
     public void testSumArrayNegativeNumbers_HappyPath() {
        int[] arr =  {-7, -3};
        int expectedResult = -10;

        int actualResult = new SumArray().sumArray(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
