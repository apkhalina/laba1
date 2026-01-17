//Дана сигнатура метода: public int sumLastNums (int x);
//Необходимо реализовать метод таким образом, чтобы он возвращал результат
//сложения двух последних знаков числах, предполагая, что знаков в числе не
//менее двух.

import java.util.Scanner;

class Main {

    public static int sumLastNums(int x) {
        if (x / 10 > 0) {
            int last = x % 10;
            int preLast = (x / 10) % 10;
            return last + preLast;
        } else {
            System.out.println("Ошибка: нужно число минимум из двух цифр!");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        boolean isNumber = false;

        System.out.println("Введите число: ");

        // Продолжаем запрашивать ввод, пока не получим число
        while (!isNumber) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                isNumber = true;
            } else {
                System.out.println("Ошибка! Можно вводить только цифры.");
                System.out.print("Попробуйте снова: ");
                scanner.next(); // очищаем некорректный ввод
            }
        }

        int result = sumLastNums(number);
        System.out.println("Сумма последних двух цифр: " + result);

        scanner.close();
    }
}