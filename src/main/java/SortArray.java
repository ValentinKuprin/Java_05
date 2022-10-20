import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
    /** Написать алгоритм SortArray, который принимает на вход массив целых чисел, и сортирует элементы массива в порядке возрастания. */

    public int[] sortArray(int[] arr) {
        if (arr.length > 0) {
            int temp;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            return arr;
        }

        return new int[0];
    }
}
