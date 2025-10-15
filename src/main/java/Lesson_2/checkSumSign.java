package Lesson_2;

public class checkSumSign {
    public static void main(String[] args) {
        int a = -5; // любое значение
        int b = 3; // любое значение
        int  sum = a + b; // сумма
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}