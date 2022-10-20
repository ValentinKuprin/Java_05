import java.util.Arrays;

public class MinMaxAve {
    /**
     * Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов. Алгоритм возвращает массив,
     * который содержит минимальное значение, максимальное значение,  и среднее среди всех значений между 2-мя индексами.
     */

    public double[] minMaxAve(int[] arr, int index1, int index2) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sumSequence = 0;
        int longSequence = 0;
        if (arr.length > 0 && index1 <= arr.length && index2 <= arr.length && index1 >= 0 && index2 >= 0) {
            if (index1 < index2) {

                for (int i = index1; i <= index2; i++) {
                    if (min > arr[i]) {
                        min = arr[i];
                    }
                    if (max < arr[i]) {
                        max = arr[i];
                    }
                    sumSequence += arr[i];
                    longSequence = index2 - index1 + 1;
                }
            } else if (index1 > index2) {
                for (int i = index1; i >= index2; i--) {
                    if (min > arr[i]) {
                        min = arr[i];
                    }
                    if (max < arr[i]) {
                        max = arr[i];
                    }
                    sumSequence += arr[i];
                    longSequence = index1 - index2 + 1;
                }
            } else {
                min = arr[index1];
                max = arr[index2];
                sumSequence = arr[index1] + arr[index2];
                longSequence = 2;
                System.out.println(sumSequence);
                System.out.println(longSequence);
            }
            double avg = sumSequence / longSequence;
            double[] minMaxAvg = new double[] {min, max, avg};
            return minMaxAvg;
        }
        return new double[0];
    }

//    public static void main(String[] args) {
//
//        minMaxAve(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2, 2);
//    }
}


