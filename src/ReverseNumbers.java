//Дана сигнатура метода: public String reverseListNums (int x);
//Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
//которой будут записаны все числа от x до 0 (включительно).

import java.util.Scanner;

class ReverseNumbers {

    public static String reverseListNums(int x) {
        String result = "";
        for (int i = x; i >= 0; i--) {
            result += i + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число x: ");
        int x = scanner.nextInt();

        String result = reverseListNums(x);

        System.out.println("\nРезультат: \"" + result + "\"");

        scanner.close();
    }
}