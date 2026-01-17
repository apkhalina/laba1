//Дана сигнатура метода: public bool isPositive (int x);
//Необходимо реализовать метод таким образом, чтобы он принимал число x и
//возвращал true, если оно положительное.

import java.util.Scanner;

public class isPositive {

    public static boolean isPositive(int x) {
        return x > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Это не число! Введите число: ");
            scanner.next();
        }

        int number = scanner.nextInt();
        boolean result = isPositive(number);

        System.out.println("Число " + number + " положительное? " + result);

        scanner.close();
    }
}