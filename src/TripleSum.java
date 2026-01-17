//Дана сигнатура метода: public bool sum3 (int x, int y, int z);
//Необходимо реализовать метод таким образом, чтобы он возвращал true, если
//два любых числа (из трех принятых) можно сложить так, чтобы получить
//третье.

import java.util.Scanner;

class TripleSum {

    public static boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите три числа через пробел: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        boolean result = sum3(x, y, z);

        System.out.println("\nЧисла: " + x + ", " + y + ", " + z);
        System.out.println("Результат: " + result);

        if (result) {
            System.out.println("Одно число является суммой двух других!");
        } else {
            System.out.println("Ни одно число не является суммой двух других");
        }

        scanner.close();
    }
}