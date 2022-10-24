import java.util.Arrays;

public class CreateArray {
    /**
     * В классе CreateArray написать метод createIntArrayFromText(), который принимает на вход строку чисел
     * (н-р, “3 4 1 8 10 12.3”) и возвращает массив типа int[] из этих чисел. (можно использовать split() или toCharArray())
     */

    public static int[] createArray(String str) {
        if (!str.isEmpty()) {
            String newStr = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '-' && str.charAt(i + 1) >= '0' && str.charAt(i) == '-' && str.charAt(i + 1) <= '9'
                        || str.charAt(i) == '.' && str.charAt(i + 1) >= '0' && str.charAt(i) == '.' && str.charAt(i + 1) <= '9'
                        || str.charAt(i) == ',' && str.charAt(i + 1) >= '0' && str.charAt(i) == ',' && str.charAt(i + 1) <= '9') {

                    newStr += str.charAt(i);
                } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    newStr += str.charAt(i);
                } else {
                    newStr += " ";
                }
            }
//            for (int i = 0; i < newStr.length(); i++) {
//                if (newStr.charAt(i) == ' ' && newStr.charAt(i + 1) == ' ') {
//                    newStr += "";
//                } else {
//                    newStr += newStr.charAt(i);
//                }
//            }//TODO; отформатировать в массив
            System.out.println(newStr);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        createArray("3 4 1 8 10 12.3 hj pooo -78 uihiu8979klnjk 2.3  2,4 -2,3");
    }
}
