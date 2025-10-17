package Lesson_3;

public class Tovar {
    private String nazvanie;
    private String dataProizvodstva;
    private String proizvoditel;
    private String stranaProiskhozhdeniya;
    private int tsena;
    private boolean sostoyanieBronirovaniya;
    public Tovar(String nazvanie, String dataProizvodstva, String proizvoditel, String stranaProiskhozhdeniya, int tsena, boolean sostoyanieBronirovaniya) {
        this.nazvanie = nazvanie;
        this.dataProizvodstva = dataProizvodstva;
        this.proizvoditel = proizvoditel;
        this.stranaProiskhozhdeniya = stranaProiskhozhdeniya;
        this.tsena = tsena;
        this.sostoyanieBronirovaniya = sostoyanieBronirovaniya;
    }
    public void info() {
        System.out.println("Информация о товаре:");
        System.out.println("Название: " + nazvanie);
        System.out.println("Дата производства: " + dataProizvodstva);
        System.out.println("Производитель: " + proizvoditel);
        System.out.println("Страна происхождения: " + stranaProiskhozhdeniya);
        System.out.println("Цена: " + tsena);
        System.out.println("Забронирован: " + (sostoyanieBronirovaniya ? "Да" : "Нет"));
        System.out.println("========================================");
    }
    public static void main(String[] args) {
        Tovar[] tovarsArray = new Tovar[5];
        tovarsArray[0] = new Tovar("Телефон", "2025-10-07", "Samsung", "Южная Корея", 65000, true);
        tovarsArray[1] = new Tovar("Ноутбук", "2024-05-15", "Dell", "USA", 85000, false);
        tovarsArray[2] = new Tovar("Планшет", "2023-11-20", "Apple", "USA", 70000, true);
        tovarsArray[3] = new Tovar("Телевизор", "2022-09-10", "LG", "South Korea", 55000, false);
        tovarsArray[4] = new Tovar("Камера", "2021-12-01", "Canon", "Japan", 45000, true);
        for (int i = 0; i < tovarsArray.length; i++) {
            tovarsArray[i].info();
        }
    }
}