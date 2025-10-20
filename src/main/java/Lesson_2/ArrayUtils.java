package Lesson_2;

public class ArrayUtils {
    public static int[] createArray(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = initialValue;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = createArray(4, 6);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
