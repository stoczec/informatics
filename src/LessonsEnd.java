import java.util.Scanner;

public class LessonsEnd {
    public static void main(String[] args) {
        //Задача №2950. Конец уроков
        /*
        В некоторой школе занятия начинаются в 9:00.
        Продолжительность урока — 45 минут, после 1-го, 3-го, 5-го и т.д.
        уроков перемена 5 минут, а после 2-го, 4-го, 6-го и т.д. — 15 минут.
        Определите, когда заканчивается указанный урок.

        Входные данные
        Дан номер урока (число от 1 до 10).

        Выходные данные
        Выведите два целых числа: время окончания урока в часах и минутах. При решении этой задачи нельзя пользоваться циклами и условными инструкциями.

        Примеры
        входные данные
        3
        выходные данные
        11 35
        входные данные
        2
        выходные данные
        10 35
        */
        Scanner scanner = new Scanner(System.in);
        int lesson = scanner.nextInt();
        String [] arr = {"9 00", "9 45", "10 35", "11 35", "12 25", "13 25", "14 15", "15 15", "16 05", "17 05", "17 55"};
        System.out.println(arr[lesson]);

    }
}
