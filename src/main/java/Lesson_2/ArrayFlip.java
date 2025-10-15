package Lesson_2;

public class ArrayFlip {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; // исходный массив

        // Проходим по массиву и меняем элементы
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1; // заменяем 0 на 1
            } else if (array[i] == 1) {
                array[i] = 0; // заменяем 1 на 0
            }
        }

        // Выводим результат
        System.out.println("Изменённый массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

}
