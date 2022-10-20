import javax.swing.plaf.IconUIResource;

public class PeakElement {
    /**
     * Написать алгоритм PeakElement, который принимает на вход массив целых чисел и возвращает значения пиковых элементов (элементы, которые больше своих соседей).
     */

    public static int[] peakElement(int[] arr) {
        if (arr.length > 0) {
            int count = 0;
            int[] newArr;
            for (int i = 0; i < arr.length; i++) {
                if (i == 0 && arr[i] > arr[i + 1]) {
                    count++;
//                    newArr[j] = arr[i]
                } else if (i > 0 && i < arr.length - 1 &&arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    count++;
//                        newArr[j] = arr[i]
                } else if (i == arr.length - 1) {
                    if (arr[i] > arr[i - 1]) {
                        count++;
//                        newArr[j] = arr[i]
                    }
                    count++;
//                        newArr[j] = arr[i - 1]
                }
            }
            System.out.println(count);

        }
        return new int[0];
    }
    // TODO:

    public static void main(String[] args) {

        peakElement(new int[]{3, 2, 7, 5, 1, 9, 23, 1});
    }
}

