import java.util.Scanner;

public class ValueExchange {
    public static void main(String[] args) {
        //Задача №2949. Обмен значений
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b =scanner.nextInt();
        int c = a + b;
        a = b;
        b = c - b;

        System.out.println(a + " " + b);

    }
}
