import java.util.Arrays;

public class Intersection {
    /**
     * Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и возвращает массив общих элементов.
     */

    public int[] intersection(int[] arr1, int[] arr2) {
        if (arr1.length > 0 || arr2.length > 0) {
            int count = 0;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        count++;
                    }
                }
            }
            int k = 0;
            int[] common = new int[count];
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        common[k] += arr2[j];
                        k++;
                    }
                }

            }
//            System.out.println(Arrays.toString(common));
            return common;
        }

        return new int[0];
    }
}
