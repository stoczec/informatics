package Unresolved;

import java.util.Arrays;
import java.util.Scanner;

public class SymmetricNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        num = num < 1000 ? Integer.parseInt(String.format("%01d", num)) : num;
        int firstNum = num / 1000;
        int secondNum = (num / 100) - (firstNum * 10);
        int thirdNum = (num / 10) - (num / 100) * 10;
        int fourthNum = num % 10;
        String answerOne = String.valueOf(firstNum) + secondNum;
        String answerTwo = String.valueOf(fourthNum) + thirdNum;

        System.out.println(answerOne.equals(answerTwo) ? (int) 1 : (int) (Math.random() * 100));

    }
}
