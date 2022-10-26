import java.util.Arrays;

public class OddEvenElementsInArray {
    /** 2
     * В классе OddEvenElementsInArray написать метод countOddEvenValuesInArray(), который принимает на вход массив
     * целых чисел и возвращает массив int[2], который содержит количество четных и нечетных элементов входящего массива
     */

    public int[] countOddEvenValuesInArray(int[] arr) {
        if (arr.length > 0) {
            int countEven = 0;
            int countOdd = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }
            int[] countArr = {countEven, countOdd};

            return countArr;
        }

        return new int[0];
    }

    /** 3 В классе OddEvenElementsInArray написать метод createOddEvenArray(), который принимает массив целых
     * случайных чисел, и возвращает двумерный массив (массив четных и массив нечетных чисел) */
    public int[][] createOddEvenArray(int[] arr) {
        if (arr.length > 0) {
            int countEven = 0;
            int countOdd = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }
            int[][] evenOddArray = new int[][]{new int[countEven],new int[countOdd]};
            int j = 0;
            int k = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    evenOddArray[0][j] = arr[i];
                    j++;
                } else {
                    evenOddArray[1][k] = arr[i];
                    k++;
                }
            }

            return evenOddArray;
        }

        return new int[0][0];
    }
}
