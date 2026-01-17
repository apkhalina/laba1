//Дана сигнатура метода: public int[]add (int[] arr, int x, int pos);
//Необходимо реализовать метод таким образом, чтобы он возвращал новый
//массив, который будет содержать все элементы массива arr, однако в позицию
//pos будет вставлено значение x.

import java.util.Scanner;
import java.util.Arrays;

public class ArrayInsert {

    public static int[] add(int[] arr, int x, int pos) {
        int[] newArr = new int[arr.length + 1];

        // Копируем элементы до позиции вставки
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        // Вставляем новый элемент
        newArr[pos] = x;

        // Копируем элементы после позиции вставки
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ВСТАВКА ЭЛЕМЕНТА В МАССИВ");
        System.out.println("========================");

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("\nВведите элемент для вставки: ");
        int x = scanner.nextInt();

        System.out.print("Введите позицию для вставки (0-" + size + "): ");
        int pos = scanner.nextInt();

        if (pos < 0 || pos > size) {
            System.out.println("Ошибка! Позиция должна быть от 0 до " + size);
            return;
        }

        int[] newArr = add(arr, x, pos);

        System.out.println("\nИсходный массив: " + Arrays.toString(arr));
        System.out.println("Вставлен элемент: " + x + " на позицию " + pos);
        System.out.println("Новый массив: " + Arrays.toString(newArr));

        scanner.close();
    }
}