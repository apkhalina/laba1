//Дана сигнатура метода: public void printDays (String x);
//В качестве параметра метод принимает строку, в которой записано название
//дня недели. Необходимо реализовать метод таким образом, чтобы он выводил
//на экран название переданного в него дня и всех последующих до конца недели
//дней. Если в качестве строки передан не день, то выводится текст “это не день
//недели”. Первый день понедельник, последний – воскресенье. Вместо if в данной
//задаче используйте switch.

import java.util.Scanner;

class WeekDaysPrinter {

    public static void printDays(String x) {
        switch (x) {
            case "понедельник" -> {
                System.out.println("понедельник");
                System.out.println("вторник");
                System.out.println("среда");
                System.out.println("четверг");
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
            }
            case "вторник" -> {
                System.out.println("вторник");
                System.out.println("среда");
                System.out.println("четверг");
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
            }
            case "среда" -> {
                System.out.println("среда");
                System.out.println("четверг");
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
            }
            case "четверг" -> {
                System.out.println("четверг");
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
            }
            case "пятница" -> {
                System.out.println("пятница");
                System.out.println("суббота");
                System.out.println("воскресенье");
            }
            case "суббота" -> {
                System.out.println("суббота");
                System.out.println("воскресенье");
            }
            case "воскресенье" -> System.out.println("воскресенье");
            default -> System.out.println("это не день недели");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день недели:");
        printDays(scanner.nextLine());

        scanner.close();
    }
}