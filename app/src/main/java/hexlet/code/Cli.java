package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static String name;

    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        name = scanner.next();
        System.out.printf("Hello, %s!\n", name);
    }

    public static String getName() {
        return name;
    }
}
