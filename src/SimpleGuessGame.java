//Дана сигнатура метода: public void guessGame()
//Необходимо реализовать метод таким образом, чтобы он генерировал
//случайное число от 0 до 9, далее считывал с консоли введенное пользователем
//число и выводил, угадал ли пользователь то, что было загадано, или нет. Метод
//запускается до тех пор, пока пользователь не угадает число. После этого
//выведите на экран количество попыток, которое потребовалось пользователю,
//чтобы угадать число.

import java.util.Random;
import java.util.Scanner;

public class SimpleGuessGame {

    public static void guessGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(10); // 0-9
        int attempts = 0;
        int guess = -1;

        System.out.println("Я загадал число от 0 до 9.");

        while (guess != secretNumber) {
            attempts++;
            System.out.print("Попытка " + attempts + ". Введите число: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Ошибка! Введите число от 0 до 9: ");
                scanner.next();
            }

            guess = scanner.nextInt();

            if (guess < 0 || guess > 9) {
                System.out.println("Число должно быть от 0 до 9!");
                attempts--;
                continue;
            }

            if (guess != secretNumber) {
                System.out.println("Не угадали!");
            }
        }

        System.out.println("Поздравляю! Вы угадали число " + secretNumber + "!");

        // Правильное окончание для слова "попытка"
        String ending;
        if (attempts % 10 == 1 && attempts % 100 != 11) {
            ending = "попытку";
        } else if (attempts % 10 >= 2 && attempts % 10 <= 4 &&
                (attempts % 100 < 12 || attempts % 100 > 14)) {
            ending = "попытки";
        } else {
            ending = "попыток";
        }

        System.out.println("Вам потребовалось " + attempts + " " + ending);
    }

    public static void main(String[] args) {
        guessGame();
    }
}