//Дана сигнатура метода: public void reverse (int[] arr);
//Необходимо реализовать метод таким образом, чтобы он изменял массив arr.
//После проведенных изменений массив должен быть записан задом-наперед.

import java.util.Scanner;
import java.util.Arrays;

public class ArrayReverse {

    public static void reverse(int[] arr) {
        // Меняем местами элементы от концов к центру
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("РЕВЕРС МАССИВА");
        System.out.println("==============");

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nИсходный массив: " + Arrays.toString(arr));

        reverse(arr);

        System.out.println("После реверса: " + Arrays.toString(arr));

        scanner.close();
    }
}