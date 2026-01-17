//Дана сигнатура метода: public int[] concat (int[] arr1,int[] arr2);
//Необходимо реализовать метод таким образом, чтобы он возвращал новый
//массив, в котором сначала идут элементы первого массива (arr1), а затем
//второго (arr2).

import java.util.Scanner;
import java.util.Arrays;

public class ArrayConcatenation {

    public static int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер первого массива: ");
        int size1 = scanner.nextInt();

        int[] arr1 = new int[size1];
        System.out.println("Введите элементы первого массива:");
        for (int i = 0; i < size1; i++) {
            System.out.print("arr1[" + i + "] = ");
            arr1[i] = scanner.nextInt();
        }

        System.out.print("\nВведите размер второго массива: ");
        int size2 = scanner.nextInt();

        int[] arr2 = new int[size2];
        System.out.println("Введите элементы второго массива:");
        for (int i = 0; i < size2; i++) {
            System.out.print("arr2[" + i + "] = ");
            arr2[i] = scanner.nextInt();
        }

        // Объединение
        int[] result = concat(arr1, arr2);

        System.out.println("\nИсходные массивы:");
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("\nОбъединенный массив:");
        System.out.println("result: " + Arrays.toString(result));
        System.out.println("Длина: " + result.length);

        scanner.close();
    }
}