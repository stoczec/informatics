import java.util.Scanner;

public class NextPrevios {
    public static void main(String[] args) {
        //Задача №2937. Следующее и предыдущее

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberPlus = number +1;
        int numberMinus = number -1;
        System.out.println("The next number for the number " + number + " is " + numberPlus + ".");
        System.out.println("The previous number for the number " + number + " is " + numberMinus + ".");
    }
}
