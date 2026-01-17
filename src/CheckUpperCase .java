//Дана сигнатура метода: public bool isUpperCase (char x);
//Необходимо реализовать метод таким образом, чтобы он принимал символ x и
//возвращал true, если это большая буква в диапазоне от ‘A’ до ‘Z’.

import java.util.Scanner;

class CheckUpperCase {

    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите символ: ");

        // Читаем строку и берем первый символ
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("Вы не ввели ни одного символа!");
            scanner.close();
            return;
        }

        char symbol = input.charAt(0);
        boolean result = isUpperCase(symbol);

        System.out.println("\nАнализ символа:");
        System.out.println("Символ: '" + symbol + "'");
        System.out.println("Заглавная буква? " + result);



        scanner.close();
    }
}