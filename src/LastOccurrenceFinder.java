//Дана сигнатура метода: public int findLast (int[] arr, int x);
//Необходимо реализовать метод таким образом, чтобы он возвращал индекс
//последнего вхождения числа x в массив arr. Если число не входит в массив –
//возвращается -1.

import java.util.Scanner;
import java.util.Arrays;

public class LastOccurrenceFinder {

    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("\nВведите число для поиска: ");
        int x = scanner.nextInt();

        // Поиск
        int result = findLast(arr, x);

        System.out.println("\nМассив: " + Arrays.toString(arr));
        System.out.println("Искомое число: " + x);

        if (result == -1) {
            System.out.println("Результат: число не найдено");
        } else {
            System.out.println("Результат: последнее вхождение на позиции " + result);
        }

        scanner.close();
    }
}