package Lesson_2;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int yearToCheck = 2000; // Год, который проверяем
        boolean result = isLeapYear(yearToCheck);
        System.out.println("Год " + yearToCheck + " является високосным: " + result);
    }
}
