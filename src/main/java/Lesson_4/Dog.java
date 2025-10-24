package Lesson_4;

public class Dog extends Animal {
    private static int countDogs = 0;

    public Dog(String name) {
        super(name);
        countDogs++;
    }

    public static int getCountDogs() {
        return countDogs;
    }

    @Override
    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    @Override
    public void swim(int distance) {
        int maxSwimDistance = 10;
        if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }
}
