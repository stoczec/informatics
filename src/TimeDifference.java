import java.util.Arrays;
import java.util.Scanner;

public class TimeDifference {
    public static void main(String[] args) {
        // Задача №2952. Разность времен

        Scanner scanner = new Scanner(System.in);
        int[] arr = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int secOne = (arr[0] * 3600) + (arr[1] * 60) + arr[2];
        int secTwo = (arr[3] * 3600) + (arr[4] * 60) + arr[5];

        System.out.println(secTwo - secOne);

    }
}
