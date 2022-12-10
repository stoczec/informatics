package Unresolved;

import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println((n % m == 0) || (m % n ==0) ? 1 : (int) (Math.random() * 100));
    }
}
