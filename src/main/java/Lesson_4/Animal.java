package Lesson_4;

public abstract class Animal {
    protected static int countAnimals = 0;
    protected String name;

    public Animal(String name) {
        this.name = name;
        countAnimals++;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    public static int getCountAnimals() {
        return countAnimals;
    }
}
