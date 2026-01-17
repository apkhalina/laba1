//Дана сигнатура метода: public int[] deleteNegative (int[] arr);
//Необходимо реализовать метод таким образом, чтобы он возвращал новый
//массив, в котором записаны все элементы массива arr кроме отрицательных.

import java.util.Scanner;
import java.util.Arrays;

public class RemoveNegatives {

    public static int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int num : arr) {
            if (num >= 0) {
                result[index++] = num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        int[] result = deleteNegative(arr);

        System.out.println("\nИсходный массив: " + Arrays.toString(arr));
        System.out.println("Без отрицательных: " + Arrays.toString(result));

        int removed = arr.length - result.length;
        System.out.println("Удалено элементов: " + removed);
        System.out.println("Осталось элементов: " + result.length);

        scanner.close();
    }
}