package Unresolved;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        //Задача №2955. Улитка
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int numOne = h / a;

        int numTwo = numOne > h ? numOne : (h / (numOne * a - (numOne * b)));
        int numThree = numTwo > h ? numTwo : (h / (numTwo * a - (numTwo * b)));


        System.out.println(numOne);
        System.out.println(numTwo);
        System.out.println(numThree);

    }
}
