package zadanie_2;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory directory = new PhoneDirectory();

        directory.add("Smith", "123-4567");
        directory.add("Johnson", "987-6543");
        directory.add("Smith", "234-5678");
        directory.add("Brown", "555-5555");

        System.out.println("Phones for Smith: " + directory.get("Smith"));
        System.out.println("Phones for Johnson: " + directory.get("Johnson"));
        System.out.println("Phones for Brown: " + directory.get("Brown"));

        directory.printAll();
    }
}
