package com.company;


import java.util.Scanner;

public class MainColor {

    // Парсинг цвета?
    // RGB (red, green, blue)
    // RGB (red, green, blue)

    // input <- color ("red")
    // output -> hex code ("#FF0000")

    // red, blue, green, cyan, black, white, gray
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String color = scanner.nextLine();
        switch (color) {
            case "red":
                System.out.println("#FF0000");
                break;
            case "blue":
                System.out.println("#0000FF");
                break;
            case "green":
                System.out.println("#00FF00");
                break;
            case "cyan":
                System.out.println("#00FFFF");
                break;
            case "черный":
            case "blck":
            case "blm":
            case "black":
                System.out.println("#000000");
                break;
            case "white":
                System.out.println("#FFFFFF");
                break;
            case "gray":
                System.out.println("#EEEEEE");
                break;
            default:
                System.out.println("IDK color " + color + ".");
                break;
        }

        // ONLY IN JAVA >= 14
        // switch (color) {
        //     case "red" -> System.out.println("#FF0000");
        //     case "blue" -> System.out.println("#0000FF");
        //     case "green" -> System.out.println("#00FF00");
        //     case "cyan" -> System.out.println("#00FFFF");
        //     case "черный", "blck", "blm", "black" -> System.out.println("#000000");
        //     case "white" -> System.out.println("#FFFFFF");
        //     case "gray" -> System.out.println("#EEEEEE");
        //     default -> System.out.println("IDK color " + color + ".");
        // }
    }
}
