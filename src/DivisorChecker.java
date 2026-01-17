//Дана сигнатура метода: public bool isDivisor (int a, int b);
//Необходимо реализовать метод таким образом, чтобы он возвращал true, если
//любое из принятых чисел делит другое нацело.


import java.util.Scanner;

class DivisorChecker {

    public static boolean isDivisor(int a, int b) {
        if (a == 0 || b == 0) {
            return false;
        }
        return (a % b == 0) || (b % a == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            scanner.next();
        }
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            scanner.next();
        }
        int b = scanner.nextInt();

        boolean result = isDivisor(a, b);

        System.out.println("\nРезультат: " + result);
        System.out.println("Числа: " + a + " и " + b);

        if (result) {
            if (a % b == 0) {
                System.out.println(a + " делится на " + b);
            }
            if (b % a == 0) {
                System.out.println(b + " делится на " + a);
            }
        } else {
            System.out.println("Ни одно число не делится на другое нацело");
        }

        scanner.close();
    }
}