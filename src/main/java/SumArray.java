public class SumArray {
    /** Написать алгоритм SumArray, который возвращает сумму всех чисел массива */

    public int sumArray(int[] arr) {
        if (arr.length > 0) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }

            return sum;
        }

        return 0;
    }

}
