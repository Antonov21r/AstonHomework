package zadanie_2;

public class Main {
    public static void main(String[] args) {
        // Ваш существующий код
        Shape circle = new Circle(5, "red", "black");
        Shape rectangle = new Rectangle(4, 6, "blue", "green");
        Shape triangle = new Triangle(3, 4, 5, "yellow", "purple");

        System.out.println("Круг:");
        circle.printProperties();

        System.out.println("Прямоугольник:");
        rectangle.printProperties();

        System.out.println("Треугольник:");
        triangle.printProperties();
    }
}
