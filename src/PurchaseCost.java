import java.util.Scanner;

public class PurchaseCost {
    public static void main(String[] args) {
            //Задача №2951. Стоимость покупки

        Scanner scanner = new Scanner(System.in);
        int rub = scanner.nextInt();
        int kop = scanner.nextInt();
        int pie = scanner.nextInt();
        int answerRub;
        int answerKop;

        if (pie * kop >= 100 && (pie * kop) % 100 > 0){
            answerRub = (pie * rub) + ((pie * kop) / 100);
            answerKop = (pie * kop) % 100;
            System.out.println(answerRub + " " + answerKop);
        } else if (pie * kop >= 100) {
            answerRub = (pie * rub) + ((pie * kop) / 100);
            answerKop = 0;
            System.out.println(answerRub + " " + answerKop);
        } else {
            answerRub = pie * rub;
            answerKop = pie * kop;
            System.out.println(answerRub + " " + answerKop);
        }
    }
}
