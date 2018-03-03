package vu.co.kaiyin.introjava.chapter1;

public class Homework5 {
    public static void main(String[] args) {
        double PI = calculatePI(1220);
        System.out.println(PI);
    }

    public static double calculatePI(int n) {
        double result = 0.0;
        double sign = 1.0;
        for(int i = 1; i <= n; i++) {
            double x = (double)(2 * i - 1);
            result +=  sign * 1.0/x;
            sign *= -1.0;
        }
        return result * 4.0;
    }
}
