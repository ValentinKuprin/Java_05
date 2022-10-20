import java.util.Arrays;

public class NegativeOnTheRight {
    /**
     * Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел, и возвращает массив,
     * в котором все негативные числа находятся во второй половине массива (массив не должен быть отсортирован)
     */

    public static int[] negativeOnTheRight(int[] arr) {
        if (arr.length > 0) {
            int[] newArr = new int[arr.length];
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 0) {
                    newArr[count] += arr[i];
                    count++;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    newArr[count] += arr[i];
                    count++;
                }
            }
            System.out.println(Arrays.toString(newArr));
            return newArr;
        }
        return new int[0];
    }

    public static void main(String[] args) {

        negativeOnTheRight(new int[] {4, -3, 7, -12, 5, -2, 9, 4, 12});
    }
}
