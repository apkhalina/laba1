//Дана сигнатура метода: public void leftTriangle (int x);
//Необходимо реализовать метод таким образом, чтобы он выводил на экран
//треугольник из символов ‘*’ у которого х символов в высоту, а количество
//символов в ряду совпадает с номером строки.

import java.util.Scanner;

public class LeftTriangle {

    public static void leftTriangle(int x) {
        String line = "";
        for (int i = 1; i <= x; i++) {
            line += "*";
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите высоту треугольника: ");
        int height = scanner.nextInt();

        System.out.println("\nТреугольник высотой " + height + ":");
        leftTriangle(height);

        scanner.close();
    }
}