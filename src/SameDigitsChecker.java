//

import java.util.Scanner;

class SameDigitsChecker {

    public static boolean equalNum(int x) {
        x = Math.abs(x); // Абсолютное значение (модуль)

        // Если число меньше 10, все цифры "одинаковы"
        if (x < 10) {
            return true;
        }

        // Получаем последнюю цифру для сравнения
        int lastDigit = x % 10;
        x /= 10;

        // Проверяем остальные цифры
        while (x > 0) {
            if (x % 10 != lastDigit) {
                return false;
            }
            x /= 10;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        boolean result = equalNum(number);

        System.out.println("Все цифры в числе " + number + " одинаковы? " + result);

        scanner.close();
    }
}