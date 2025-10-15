package Lesson_2;

public class StringRepeater {
    // Метод принимает строку и число, и выводит строку указанное количество раз
    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        // Пример использования метода
        printStringMultipleTimes("Привет, мир!", 3);
    }
}

