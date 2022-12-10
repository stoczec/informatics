import java.util.Scanner;

public class TwoDigit {
    public static void main(String[] args) {
        //Задача №2942. Число десятков двузначного числа
        Scanner scanner = new Scanner(System.in);

        int digit = scanner.nextInt();
        System.out.println(digit / 10);
    }
}
