import java.util.Arrays;

public class NumberOccurrences {
    /**
     * Написать алгоритм NumberOccurrences,  который принимает на вход массив целых чисел,  и возвращает массив пар
     * {число, сколько раз число встречается в массиве}
     */

    public int[][] numberOccurrences(int[] arr) {
        if (arr.length > 0) {
            int unique = 1;
            int[] sortArr = new SortArray().sortArray(arr);
            for (int i = 0; i < sortArr.length - 1; i++) {
                for (int j = i + 1; j < sortArr.length - 1; j++) {
                    if (sortArr[i] == sortArr[j]) {
                        break;
                    }
                    if (sortArr[i] != sortArr[j]) {
                        unique++;
                        break;

                    }
                }
            }
            int[][] numOccurrences = new int[unique][2];
            int iterator = 0;
            int sum = 0;

            for (int i = 0; i < sortArr.length; i+= sum) {
                numOccurrences[iterator][0] = sortArr[i];
                sum = 0;

                for (int j = 0; j < sortArr.length; j++) {
                    if (sortArr[i] == sortArr[j]) {
                        sum++;
                    }
                    numOccurrences[iterator][1] = sum;
                }
                iterator++;
            }
            System.out.println(Arrays.deepToString(numOccurrences));
            return numOccurrences;
        }
        return new int[0][0];
    }
//    public static void main(String[] args) {
//
//        System.out.println(Arrays.deepToString(numberOccurrences(new int[]{3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1})));
//    }
}

//1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5