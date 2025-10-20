package Lesson_2;

public class FillArray {
    public static void main(String[] args) {
        int[] array = new int[100]; // создаем пустой массив длиной 100
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

