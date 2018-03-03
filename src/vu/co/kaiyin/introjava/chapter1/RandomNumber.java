package vu.co.kaiyin.introjava.chapter1;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {

    public static void main(String[] args) {
        // write your code here
        int x = getnumber();
        System.out.printf("Got a random number: %d", x);
    }

    private static int getnumber() {
        return ThreadLocalRandom.current().nextInt(-10, 11);
    }
}