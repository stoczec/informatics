import java.util.Scanner;

public class LasrDigit {
    public static void main(String[] args) {
        //Задача №2941. Последняя цифра

        Scanner scanner = new Scanner(System.in);

        int digit = scanner.nextInt();

        System.out.println(digit % 10);
    }
}
