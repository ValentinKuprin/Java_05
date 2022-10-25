import java.util.Arrays;

public class OddEvenElementsInArray {
    /**
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

    /** В классе OddEvenElementsInArray написать метод createOddEvenArray(), который принимает массив целых
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
            int newArr[][] = new int[countEven][countOdd];
            int j = 0;
            int k = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    newArr[j][countEven] = arr[i];
                    j++;
                } else {
                    newArr[countOdd][k] = arr[i];
                    k++;
                }
            }
//            System.out.println(Arrays.deepEquals(newArr));
        }
        return new int[0][0];

    }

}
