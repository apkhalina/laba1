//Дана сигнатура метода: public int pow (int x, int y);
//Необходимо реализовать метод таким образом, чтобы он возвращал результат
//возведения x в степень y.

import java.util.Scanner;

class PowerCalculator {

    public static int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите основание: ");
        int base = scanner.nextInt();

        System.out.print("Введите степень: ");
        int exponent = scanner.nextInt();

        int result = pow(base, exponent);

        System.out.println("\nРезультат: " + result);
        System.out.println(base + "^" + exponent + " = " + result);

        if (exponent >= 0) {
            System.out.print("Процесс: ");
            for (int i = 0; i < exponent; i++) {
                System.out.print(base);
                if (i < exponent - 1) {
                    System.out.print(" * ");
                }
            }
            if (exponent == 0) {
                System.out.print("1");
            }
            System.out.println(" = " + result);
        }

        scanner.close();
    }
}