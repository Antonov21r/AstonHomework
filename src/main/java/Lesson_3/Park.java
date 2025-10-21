package Lesson_3;

public class Park {
    private String parkName;
    private Attrakcion[] attractions;
    public Park(String parkName, int numberOfAttractions) {
        this.parkName = parkName;
        this.attractions = new Attrakcion[numberOfAttractions];
    }
    public class Attrakcion {
        private String name;
        private String timeWork;
        private int cost;
        public Attrakcion(String name, String timeWork, int cost) {
            this.name = name;
            this.timeWork = timeWork;
            this.cost = cost;
        }
        public void info() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + timeWork);
            System.out.println("Стоимость: " + cost + " рублей");
        }
    }
    public void addAttraction(int index, String name, String workingHours, int cost) {
        if (index >= 0 && index < attractions.length) {
            attractions[index] = new Attrakcion(name, workingHours, cost);
        }
    }
    public void showAttractions() {
        for (Attrakcion attraction : attractions) {
            if (attraction != null) {
                attraction.info();
            }
        }
    }
}