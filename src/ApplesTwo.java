import java.util.Scanner;

public class ApplesTwo {
    public static void main(String[] args) {
        //Задача №2939. Дележ яблок - 2
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(k % n);
    }
}
