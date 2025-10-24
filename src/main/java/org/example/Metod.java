package org.example;

public class Metod {
    static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }

    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Неверный размер массива по строкам: " + array.length);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Неверный размер массива по столбцам в строке " + i + ": " + array[i].length);
            }
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] wrongSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        String[][] wrongDataArray = {
                {"1", "2", "3", "4"},
                {"5", "six", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = processArray(correctArray);
            System.out.println("Результат обработки правильного массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка при обработке правильного массива: " + e.getMessage());
        }

        try {
            int result = processArray(wrongSizeArray);
            System.out.println("Результат обработки массива с неправильным размером: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка при обработке массива с неправильным размером: " + e.getMessage());
        }

        try {
            int result = processArray(wrongDataArray);
            System.out.println("Результат обработки массива с некорректными данными: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка при обработке массива с некорректными данными: " + e.getMessage());
        }
    }
}