import org.testng.Assert;
import org.testng.annotations.Test;

public class KthLargestTest {
    /** Test Data:
     ({4, 3, 7, 13, 5, 2, 9, 4, 12}, 3) → 9
     (13 и 12 - первый и второй самые большие элементы, а метод возвращает 9, как третий самый большой элемент) */

    @Test
    public void testKthLargest() {
        int[] arr = {4, 3, 7, 13, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;
        int actualResult = new KthLargest().kthLargest(arr, k);
        Assert.assertEquals(actualResult, expectedResult);
    }

}
