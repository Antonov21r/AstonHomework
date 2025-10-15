package Lesson_2;

public class printColor {
    public static void main(String[] args) {
        int value = 1 ; // Любое значение
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");
        } else if (value > 100){
            System.out.println("Зелёный");
        }
    }
}