//Дана сигнатура метода: public String makeDecision (int x, int y);
//Необходимо реализовать метод таким образом, чтобы он возвращал строку,
//которая включает два принятых методом числа и корректно выставленный
//знак операции сравнения (больше, меньше, или равно).

import java.util.Scanner;

class ComparisonString {

    public static String makeDecision(int x, int y) {
        if (x > y) {
            return x + " > " + y;
        } else if (x < y) {
            return x + " < " + y;
        } else {
            return x + " == " + y;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();

        String result = makeDecision(x, y);

        System.out.println("\nРезультат: " + result);
        System.out.println("Строка сравнения: \"" + result + "\"");

        scanner.close();
    }
}