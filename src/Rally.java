import java.util.Scanner;

public class Rally {
    public static void main(String[] args) {
        // Задача №2953. Автопробег

        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        int route = scanner.nextInt();
        //int day = (int) Math.ceil((double) route / (double) distance);
        //int day = route / distance + (route % distance == 0 ? 0 : 1);
        int day = route / distance + (route % distance + distance - 1) / distance;

        System.out.println(day);

    }
}
