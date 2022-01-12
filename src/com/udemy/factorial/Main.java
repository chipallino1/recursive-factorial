package com.udemy.factorial;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateFactorial(8));
    }

    private static int calculateFactorial(int number) {
        int result = 1;
        if (number == 1) {
            return result;
        }
        return number * calculateFactorial(number - 1);
    }
}
