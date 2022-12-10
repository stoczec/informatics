import java.util.Scanner;

public class DigitalWatchOne {
    public static void main(String[] args) {

        //Задача №2947. Электронные часы - 1

        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        int hours = houres(value);

        System.out.println(hours + " " + (value % 60));
    }
    public static int houres(int a) {
        if (a / 60 == 24) {
            a = 0;
        } else {
            a = a / 60 % 24;
        }
        return a;
    }

}
