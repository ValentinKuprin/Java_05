package project_utils;

public class Utils {
    public static int maxValue(int k, int l) {
        if (k > l) {
            return k;
        }
        return l;
    }

    public static int minValue(int k, int l) {
        if (k < l) {
            return k;
        }
        return l;
    }

    public static boolean checkIntFromText(String str) {
        if (str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= 9) {

                    return true;
                }
            }
        }

        return false;
    }

//    public static negativeNumberFromText(String str) {
//    }
}
