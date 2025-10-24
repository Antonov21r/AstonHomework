package Lesson_4;

public class Cat extends Animal {
    private static int countCats = 0;
    private boolean isFull; // сытость
    private static final int MAX_RUN_DISTANCE = 200;
    private static final int MAX_SWIM_DISTANCE = 0; // не умеет плавать

    public Cat(String name) {
        super(name);
        countCats++;
        this.isFull = false;
    }

    public static int getCountCats() {
        return countCats;
    }

    public boolean isFull() {
        return isFull;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int amount) {
        if (amount <= 0) {
            System.out.println(name + " не хочет есть.");
            return;
        }
        if (bowl.getFood() >= amount) {
            bowl.takeFood(amount);
            isFull = true;
            System.out.println(name + " покушал " + amount + " еды. Статус сытости: " + isFull);
        } else {
            System.out.println("В миске недостаточно еды для " + name);
        }
    }
}
