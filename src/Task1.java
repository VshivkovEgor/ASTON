import java.util.Scanner;

public class Task1 {
    public static void NumberOperations() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число а:");
        int a = scanner.nextInt();

        System.out.println("Введите число b:");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a>b");
        } else if (a < b) {
            System.out.println("a<b");
        } else {
            System.out.println("a=b");
        }

        // Операция сложения
        System.out.println("a+b=" + (a + b));

        // Операция вычитания
        System.out.println("a-b=" + (a - b));

        // Операция умножения
        System.out.println("a*b=" + (a * b));

        // Операция деления
        if (b != 0) {
            System.out.println("a/b=" + ((double) a / b));
        } else {
            System.out.println("Делить на ноль нельзя");
        }
    }
}
