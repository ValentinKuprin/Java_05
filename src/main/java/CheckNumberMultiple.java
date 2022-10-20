public class CheckNumberMultiple {
    /** Given an integer M perform the following conditional actions:
     * If M is multiple of 7 and 9 then return "Good Number".
     * If M is only multiple of 9 and not of 7  then return "Bad Number"
     * If M is only multiple of 11 then return "Poor Number"
     * If M doesn't satisfy any of the above conditions then return "-1"
     * Учитывая целое число M, выполните следующие условные действия:
     * Если M кратно 7 и 9, то верните "Хорошее число".
     * Если M кратно только 9, а не 7, то верните "Неверное число".
     * Если M кратно только 11, то верните "Плохое число".
     * Если M не удовлетворяет ни одному из вышеперечисленных условий, то верните "-1"*/

    public String checkNumberMultiple(int m) {
        if (m % 7 ==0 && m % 9 == 0) {
            return "Good Number";
        } else if (m % 9 == 0 && m % 7 != 0) {
            return "Bad Number";
        } else if (m % 11 == 0) {
            return "Poor Number";
        } else {
            return "-1";
        }
    }
}
