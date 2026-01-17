//Дана сигнатура метода: public double safeDiv (int x, int y);
//Необходимо реализовать метод таким образом, чтобы он возвращал деление x
//на y, и при этом гарантировал, что не будет выкинута ошибка деления на 0. При
//делении на 0 следует вернуть из метода число 0. Подсказка: смотри
//ограничения на операции типов данных.

import java.util.Scanner;

class SafeDivision {

    public static double safeDiv(int x, int y) {
        if (y == 0) {
            return 0.0;
        }
        return (double) x / y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите делимое: ");
        int x = scanner.nextInt();

        System.out.print("Введите делитель: ");
        int y = scanner.nextInt();

        double result = safeDiv(x, y);

        System.out.println("\nРезультат: " + result);
        System.out.println(x + " / " + y + " = " + result);

        if (y == 0) {
            System.out.println("Внимание: было выполнено деление на ноль!");
            System.out.println("Возвращено защитное значение 0.0");
        }

        scanner.close();
    }
}