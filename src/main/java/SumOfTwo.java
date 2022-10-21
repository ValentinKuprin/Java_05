import java.lang.reflect.Array;
import java.util.Arrays;



public class SumOfTwo {
    /** Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,  и число n. Алгоритм  возвращает пары
     * элементов, которые в сумме дают число n. */
    /** ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}} */

    public static int[][] sumOfTwo(int[] arr, int n) {
        if (arr.length > 0) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == n) {
                        count++;
                    }
                }
            }
            int[][] arraySumOfTwo = new int[count][2];
            int iterator = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == n) {
//                        arraySumOfTwo[iterator] = new int[]{arr[i], arr[j]};
//                        iterator++;
                        arraySumOfTwo[iterator][0] = arr[i];
                        arraySumOfTwo[iterator][1] = arr[j];
                        iterator++;
                    }
                }
            }
            System.out.println(Arrays.toString(arraySumOfTwo));
            return arraySumOfTwo;

        }
        return new int[0][0];
    }

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(sumOfTwo(new int[] {4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)));
    }
}
