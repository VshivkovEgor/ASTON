import java.util.Scanner;

public class Task2 {
    public static void StringComparison() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку a: ");
        String a = scanner.nextLine();

        System.out.print("Введите строку b: ");
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
