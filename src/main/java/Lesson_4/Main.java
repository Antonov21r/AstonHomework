package Lesson_4;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шерман");
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Барсик");

        Cat[] cats = {cat1, cat2};

        Bowl bowl = new Bowl(20);

        for (Cat cat : cats) {
            cat.eat(bowl, 10); // каждый пытается съесть 10
        }

        for (Cat cat : cats) {
            System.out.println(cat.name + " сытый: " + cat.isFull());
        }

        bowl.addFood(15);
        System.out.println("В миске теперь еды: " + bowl.getFood());

        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 10);
            }
        }

        System.out.println("Остаток еды в миске: " + bowl.getFood());

        dog1.run(400);
        dog1.swim(8);
        dog2.run(250);
        dog2.swim(12);
        cat1.run(150);
        cat2.swim(5);

        System.out.println("Общее количество животных: " + Animal.getCountAnimals());
        System.out.println("Количество собак: " + Dog.getCountDogs());
        System.out.println("Количество котов: " + Cat.getCountCats());
    }
}