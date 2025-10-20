package Lesson_2;

public class NumberSignChecker {
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Передано положительное число");
        } else {
            System.out.println("Передано отрицательное число");
        }
    }

    public static void main(String[] args) {
        checkNumber(5);   // Передано положительное число
        checkNumber(-3);  // Передано отрицательное число
        checkNumber(0);   // Передано положительное число
    }
}
