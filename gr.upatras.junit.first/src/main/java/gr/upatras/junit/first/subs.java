package gr.upatras.junit.first;

public class subs {
    public static String subtraction(int a, int b) {
        int result = a - b;
        if (result >= 0) {
            return "POSITIVE";
        } else {
            return "NEGATIVE";
        }
    }
}