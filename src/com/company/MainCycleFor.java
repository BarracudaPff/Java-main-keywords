package com.company;


import java.util.Scanner;

public class MainCycleFor {

    // Циклы (for)
    // Сумму чисел введеных с консоли
    // input
    //      <- int N; // количество чисел
    //      <- int k; // N чисел через пробел
    // output -> sum of N numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += input.nextInt();
        }

        System.out.println(sum);


//        int n = 50;
//        for (int i = 0; i < n; i++) {
//            System.out.println(i + " <-> " + i * i);
//        }
    }
}
