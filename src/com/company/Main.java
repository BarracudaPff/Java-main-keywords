package com.company;


import java.util.Scanner;

public class Main {

    // Четное число или нет?
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        //Classic if
        String result;
        if (n % 2 == 0) {
            result = "Четное";
        } else {
            result = "Не четное";
        }
        System.out.println(result);

        // Ternary operator
        String ternResult = n % 2 == 0 ? "Четное" : "Не четное";

        System.out.println(ternResult);
    }
}
