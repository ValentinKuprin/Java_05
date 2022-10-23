import org.testng.Assert;
import org.testng.annotations.Test;

import java.beans.Transient;

public class PeakElementTest {
    /** Test Data:
     {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23} */

    @Test
    public void testPeakElement_firstNumberPeak_Last_Low() {
        int[] arr = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};
        int[] actualResult = new PeakElement().peakElement(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPeakElement_firstNumberPeak_LastPeak() {
        int[] arr = {3, 2, 7, 5, 1, 9, 1, 23};
        int[] expectedResult = {3, 7, 9, 23};
        int[] actualResult = new PeakElement().peakElement(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPeakElement_firstNumberLow_LastPeak() {
        int[] arr = {1, 2, 7, 5, 1, 9, 1, 23};
        int[] expectedResult = {7, 9, 23};
        int[] actualResult = new PeakElement().peakElement(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPeakElement_firstNumberEquales_SecondNumberAndLastNumberEqualsPenultimate() {
        int[] arr = {2, 2, 7, 5, 1, 9, 23, 23};
        int[] expectedResult = {7};
        int[] actualResult = new PeakElement().peakElement(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
