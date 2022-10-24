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
}
