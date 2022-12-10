import java.util.Scanner;

public class NextEven {
    public static void main(String[] args) {
        //Задача №2945. Следующее четное

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number + 2 - (number % 2));

    }
}
