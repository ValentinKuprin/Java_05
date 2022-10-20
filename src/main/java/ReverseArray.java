public class ReverseArray {
    /** Написать алгоритм ReverseArray, который принимает на вход массив целых чисел, и возвращает “перевернутый” массив. */

    public int[] reverseArray(int[] arr) {
        if (arr.length > 0) {
            int step = 0;
            int[] newArray = new int[arr.length];
            for (int i = arr.length - 1; i >= 0; i--) {
                newArray[step] += arr[i];
                step++;
            }
            return newArray;
        }
        return new int[0];
    }
}
