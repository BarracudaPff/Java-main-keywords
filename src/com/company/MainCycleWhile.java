package com.company;


import java.util.Scanner;

public class MainCycleWhile {

    // Циклы (while)
    // Сумму чисел введеных с консоли
    // input
    //      <- int k; // N чисел через пробел, последнее введенное число == -1
    // output -> sum of N numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int next = input.nextInt();
        int sum = -next;
        while (next != -1) {
            sum += next;
            next = input.nextInt();
        }
        System.out.println(sum);

//        int count = 10;
//        do {
//            System.out.println(count);
//            count--; // count = count - 1;
//        } while (count > 0);

//        int count = 10;
//        while (count > 0) {
//            System.out.println(count);
//            count--; // count = count - 1;
//        }
    }
}
