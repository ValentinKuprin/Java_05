import java.util.Arrays;

public class BubbleSort {

    public int[] bubbleSort(int[] array) {
        if (array != null && array.length > 0) {
            Boolean isSorted = false;

            while (!isSorted) {
                isSorted = true;
                for (int i = 1; i < array.length; i++) {
                    if (array[i - 1] > array[i]) {
                        int temp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = temp;
                        isSorted = false;
                    }
                }
            }

            return array;
        }

        return new int[0];
    }

    public int minValue (int[] array) {
            int minValue = array[0];
            int indexOfMin = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < minValue) {
                    minValue = array[i];
                    indexOfMin = i;
                }
            }

            return indexOfMin;
        }


    public int[] sortOfMinValue(int[] array){
        if(array != null && array.length > 0) {
            int min = Integer.MAX_VALUE;
            int indexOfMin = 0;
            for (int i = 0; i <= array.length; i++) {
                if (min > array[i]) {

                        int temp = array[i];
                        array[i] = min;
                    }
                }

            }
        }
    }
}
