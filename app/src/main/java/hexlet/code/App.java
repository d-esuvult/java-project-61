package hexlet.code;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                Your choice:\s""");
        int choice = scanner.nextInt();
        if (choice == 1) {
            Cli.greet();
        }
        if (choice == 2) {
            Even.even();
        }
        System.out.println("See you next time!");
    }
}
