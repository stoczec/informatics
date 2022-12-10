import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        //Задача №2944. Сумма цифр

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int last = number % 10;
        int preLast = number / 10 % 10;
        int prePreLast = number / 100;

        System.out.println(last + preLast + prePreLast);

    }
}
