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
}
