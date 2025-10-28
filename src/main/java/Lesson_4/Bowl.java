package Lesson_4;

public class Bowl {
    private int food;

    public Bowl(int initialFood) {
        if (initialFood < 0) {
            this.food = 0;
        } else {
            this.food = initialFood;
        }
    }

    public int getFood() {
        return food;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
        }
    }

    public void takeFood(int amount) {
        if (amount > 0 && food >= amount) {
            food -= amount;
        }
    }
}
