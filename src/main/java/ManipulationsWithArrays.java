public class ManipulationsWithArrays {
    /**
     * 4 В классе ManipulationsWithArrays написать метод getTheGreaterHalf(), который принимает массив целых чисел,
     * и возвращает  массив из суммарно бОльшей первой или второй половины входящего массива
     */

    public int[] getTheGreaterHalf(int[] arr) {
        if (arr.length > 0) {
            if (arr.length % 2 == 0) {
                int[] arrLeft = new int[arr.length / 2];
                int[] arrRight = new int[arr.length / 2];
                int indexLeftArr = 0;
                int indexRightArr = 0;
                int sumLeftArr = 0;
                int sumRightArr = 0;
                for (int i = 0, j = arr.length - 1; i < j / 2; i++, j--) {
                    arrLeft[indexLeftArr] += arr[i];
                    sumLeftArr += arr[i];
                    arrRight[indexRightArr] += arr[j];
                    sumRightArr += arr[j];

                }
                if (sumLeftArr > sumRightArr) {

                    return arrLeft;
                } else {

                    return arrRight;
                }
            } else {
                //TODO: Дописать с с нечетной последовательность.
            }
        }
    }

}
