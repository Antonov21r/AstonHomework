package Lesson_4;

class Main {
    public static void main(String[] args) {
        // Создаем массив котов
        Cat[] cats = {
                new Cat("Murka"),
                new Cat("Barsik"),
                new Cat("Pushok")
        };

        // Создаем миску с 20 ед. еды
        Bowl bowl = new Bowl(20);
        System.out.println("Изначально в миске: " + bowl.getFood() + " еды.");

        // Все коты пытаются покушать по 10 единиц
        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        // Выводим сытость котов
        for (Cat cat : cats) {
            System.out.println(cat.name + " сытый: " + cat.isFull());
        }

        System.out.println("В миске осталось: " + bowl.getFood() + " еды.");

        // Добавим еще еды
        bowl.addFood(15);
        System.out.println("Добавили еды. В миске теперь: " + bowl.getFood() + " еды.");

        // Еще раз пытаемся покормить котов
        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 10);
            }
        }

        // Итоги
        System.out.println("Общее число животных: " + Animal.getCountAnimals());
        System.out.println("Число котов: " + Cat.getCountCats());
        System.out.println("Число собак: " + Dog.getCountDogs());

        // Демонстрация бега и плавания
        Cat cat1 = cats[0];
        Dog dog1 = new Dog("Sherlock");
        dog1.run(300);
        dog1.swim(8);
        dog1.swim(15);

        cat1.run(150);
        cat1.swim(5); // кот не умеет плавать
    }
}

class Animal {
    protected static int countAnimals = 0;
    protected String name;
    public Animal(String name) {
        this.name = name;
        countAnimals++;
    }
    public void run(int distance) {
        System.out.println(name + " ran " + distance + " meters.");
    }
    public void swim(int distance) {
        System.out.println(name + " swam " + distance + " meters.");
    }
    public static int getCountAnimals() {
        return countAnimals;
    }
}
class Dog extends Animal {
    private static int countDogs = 0;
    private final int runLimit = 500;
    private final int swimLimit = 10;

    public Dog(String name) {
        super(name);
        countDogs++;
    }
    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " ran " + distance + " meters.");
        } else {
            System.out.println(name + " can't run that far.");
        }
    }
    @Override
    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " swam " + distance + " meters.");
        } else {
            System.out.println(name + " can't swim that far.");
        }
    }
    public static int getCountDogs() {
        return countDogs;
    }
}
class Cat extends Animal {
    private static int countCats = 0;
    private final int runLimit = 200;
    private boolean full = false;

    public Cat(String name) {
        super(name);
        countCats++;
        this.full = false;
    }
    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " ran " + distance + " meters.");
        } else {
            System.out.println(name + " can't run that far.");
        }
    }
    @Override
    public void swim(int distance) {
        System.out.println(name + " can't swim.");
    }
    public boolean eat(Bowl bowl, int amount) {
        if (bowl.getFood() >= amount) {
            boolean result = bowl.takeFood(amount);
            if (result) {
                full = true;
                System.out.println(name + " ate " + amount + " units of food and is full.");
                return true;
            }
        }
        System.out.println(name + " couldn't eat. Not enough food in the bowl.");
        return false;
    }
    public boolean isFull() {
        return full;
    }
    public static int getCountCats() {
        return countCats;
    }
}

class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean takeFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
        }
    }
}
