package Lesson_2;

public class NumberChecker {
    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void main(String[] args) {
        System.out.println(isNegative(5));    // false
        System.out.println(isNegative(-3));   // true
        System.out.println(isNegative(0));    // false
    }
}

