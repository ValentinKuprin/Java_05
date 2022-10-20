public class OddEven {
    /**В классе OddEven создать алгоритм oddEven(), который принимает на вход целое число, возвращает “Odd”,  если число нечетное, и “Even”, если число четное. */


    public String oddEven(int num) {
        if (num % 2 == 0) {

            return "Even";
        }

        return "Odd";
    }
}
