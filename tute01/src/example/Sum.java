package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String res = scanner.nextLine();

        String[] numbers = res.split(" ");

        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }

        System.out.println("The sum is " + sum);

        scanner.close();
    }
}
