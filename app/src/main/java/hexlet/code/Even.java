package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {

    private static final int MIN = 1;
    private static final int MAX = 100;


    public static void even() {
        Cli.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        boolean isOver = false;
        while (!isOver) {
            isOver = getQuestions();
        }
        System.out.printf("Congratulations, %s!\n", Cli.getName());
    }

    private static int getNumber() {
        Random random = new Random();
        return random.nextInt(MAX - MIN) + MIN;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static boolean isCorrect(String answer, boolean isEven) {
        if (answer.equals("yes") && isEven) {
            return true;
        } else if (answer.equals("no") && !isEven) {
            return true;
        }
        return false;
    }

    private static boolean getQuestions() {
        Scanner scanner = new Scanner(System.in);
        int number;
        String answer;
        for (int i = 0; i < 3; i++) {
            number = getNumber();
            System.out.println("Question: " + number);
            answer = scanner.next();
            if (isCorrect(answer, isEven(number))) {
                System.out.println("Correct!");
            } else {
                System.out.printf("""
                        '%s' is wrong answer ;(. Correct answer was '%s'.
                        Let's try again, %s!
                        """, answer, getCorrectAnswer(isEven(number)), Cli.getName());
                return false;
            }
        }
        return true;
    }

    private static String getCorrectAnswer(boolean isEven) {
        if (isEven) {
            return "yes";
        }
        return "no";
    }
}
