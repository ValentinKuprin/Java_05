public class OddIndices {
    /** Написать алгоритм OddIndices, который принимает массив целых чисел,  и возвращает массив значений нечетных индексов */


    public int[] oddIndices(int[] arr) {
        if (arr.length > 0) {
            int indexCount = 0;
            for (int i = 1; i < arr.length; i++) {
                if (i % 2 != 0){
                    indexCount++;
                }
            }
            int[] arrOdd = new int[indexCount];
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    arrOdd[j] += arr[i];
                    j++;
                }
            }

            return arrOdd;
        }

        return new int[0];
    }
}
