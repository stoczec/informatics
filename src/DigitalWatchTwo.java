import java.util.Scanner;

public class DigitalWatchTwo {
    public static void main(String[] args) {
        //Задача №2948. Электронные часы - 2
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        int hours = houres(value);
        int min = value / 60 % 60;
        int sec = value % 60;

        System.out.format("%01d:", hours);
        System.out.format("%02d:", min);
        System.out.format("%02d",sec);

    }

    public static int houres(int a) {
        if (a / 3600 == 24) {
            a = 0;
        } else {
            a = (a / 3600 % 24);
        }
        return a;
    }

}