//Дана сигнатура метода: public int lastNumSum(int a, int b)
//Необходимо реализовать метод таким образом, чтобы он считал сумму цифр
//двух чисел из разряда единиц. Выполните с его помощью последовательное
//сложение пяти чисел и результат выведите на экран. Постарайтесь выполнить
//задачу, используя минимально возможное количество вспомогательных
//переменных.

import java.util.Scanner;

public class LastDigitSumCalculator {

    public static int lastNumSum(int a, int b) {
        Scanner scanner = new Scanner(System.in);

        // Начинаем с суммы последних цифр первых двух чисел
        int sum = (a % 10) + (b % 10);
        System.out.println(a + " + " + b + " = " + sum);

        // Добавляем еще 3 числа
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите число: ");
            int num = scanner.nextInt();
            sum = (sum % 10) + (num % 10);
            System.out.println((sum - num % 10) + " + " + num + " = " + sum);
        }

        scanner.close();
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два начальных числа:");
        System.out.print("Первое число: ");
        int first = scanner.nextInt();

        System.out.print("Второе число: ");
        int second = scanner.nextInt();

        System.out.println("\nПроцесс сложения:");
        int result = lastNumSum(first, second);
        System.out.println("\nФинальный результат: " + result);

        scanner.close();
    }
}