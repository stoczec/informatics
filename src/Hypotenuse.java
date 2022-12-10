import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        //Задача №2936. Гипотенуза

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double c = Math.pow(a, 2) + Math.pow(b, 2);
        double hyp = Math.sqrt(c);
        System.out.println(hyp);

    }
}
