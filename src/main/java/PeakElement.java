import java.util.Arrays;

public class PeakElement {
    /**
     * Написать алгоритм PeakElement, который принимает на вход массив целых чисел и возвращает
     * значения пиковых элементов (элементы, которые больше своих соседей).
     */

    public int[] peakElement(int[] arr) {
        if (arr.length > 0) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i == 0 && arr[i] > arr[i + 1]) {
                    count++;
                } else if (i > 0 && i < arr.length - 1
                        && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    count++;
                } else if (i == arr.length - 1 && arr[arr.length - 1] > arr[arr.length - 2]) {
                    count++;
                }
            }

            int[] newPeakArr = new int[count];
            int iterator = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i == 0 && arr[i] > arr[i + 1]) {
                    newPeakArr[iterator] = arr[i];
                    iterator++;
                }else if (i > 0 && i < arr.length - 1 && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    newPeakArr[iterator] = arr[i];
                    iterator++;
                }else if (i == arr.length - 1 && arr[arr.length - 1] > arr[arr.length - 2]) {
                    newPeakArr[iterator] = arr[i];
                    iterator++;
                }
            }

            return newPeakArr;
        }

        return new int[0];
    }
}



