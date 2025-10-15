package Lesson_2;

public class DiagonalArray {
    public static void main(String[] args) {
        int n = 5; // размер массива (можете изменить по необходимости)
        int[][] array = new int[n][n]; // создание квадратного массива
        for (int i = 0; i < n; i++) {
            array[i][i] = 1; // главная диагональ
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
