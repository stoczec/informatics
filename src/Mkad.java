import java.util.Scanner;

public class Mkad {
    public static void main(String[] args) {
        //Задача №2940. МКАД

        Scanner scanner = new Scanner(System.in);

        int v = scanner.nextInt();
        int t = scanner.nextInt();
        int distance = v * t;

        /*int mark = 109 - Math.abs(distance);
        mark = Math.abs(mark);
        for (int i = mark; i > 109; i = i - 109){
            if (i < 109) break;
            System.out.println(i);
        }*/

        if (distance > 0){
            int mark = distance % 109;
            System.out.println(mark);

        }else {
            if (distance <=0){
                int mark = (109 + (distance % 109)) % 109;
                System.out.println(mark);

            }

        }
        /*if (Math.abs(mark) > 109){
            mark = Math.abs(mark) - 109;
            System.out.println(Math.abs(mark));
        }else {
            System.out.println(Math.abs(mark));
        }*/

    }
}
