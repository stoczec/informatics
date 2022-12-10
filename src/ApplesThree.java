import java.util.Scanner;

public class ApplesThree {
    public static void main(String[] args) {
        //Задача №2954. Дележ яблок - 3
        Scanner scanner = new Scanner(System.in);

        int student = scanner.nextInt();
        int apple = scanner.nextInt();
        System.out.println (apple % student == 0 ? 0 : (student - apple % student));
    }
}
