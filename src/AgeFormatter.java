//Дана сигнатура метода: public String age (int x);
//Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
//которой сначала будет число х, а затем одно из слов:
//год
//года
//лет
//Слово “год” добавляется, если число х заканчивается на 1, кроме числа 11.
//Слово “года” добавляется, если число х заканчивается на 2, 3 или 4, кроме чисел
//12, 13, 14.
//Слово “лет”добавляется во всех остальных случаях.

import java.util.Scanner;

class AgeFormatter {

    public static String age(int x) {
        int lastDigit = x % 10;
        int lastTwoDigits = x % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            return x + " лет";
        }

        switch (lastDigit) {
            case 1: return x + " год";
            case 2:
            case 3:
            case 4: return x + " года";
            default: return x + " лет";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        String result = age(age);
        System.out.println("\nРезультат: " + result);

        scanner.close();
    }
}