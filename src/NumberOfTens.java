import java.util.Scanner;

public class NumberOfTens {
    public static void main(String[] args) {
        //Задача №2943. Число десятков

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number / 10 % 10);
    }
}
