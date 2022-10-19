public class IsPositiveNumber {
    /** Напишите алгоритм IsPositiveNumber, который возвращает true, если численный  параметр больше или равен нулю,
     * и возвращает false, если параметр меньше 0. */

    public Boolean isPositiveNumber(int num) {
        if (num >= 0) {
            return true;
        }
        return false;
    }
}
