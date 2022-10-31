import org.testng.Assert;
import org.testng.annotations.Test;

public class BubbleSortTest {

    @Test
    public void testBubbleSort(){
        int[] array = {22, 17, 85, 34, 11, 83, 2, 9, 41, 13};
        int[] expectedResult = {2, 9, 11, 13, 17, 22, 34, 41, 83, 85};
        int[] actualResult = new BubbleSort().bubbleSort(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
