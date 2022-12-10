import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        //Задача №2958. Максимум
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a >= b ? a : b);
    }
}
