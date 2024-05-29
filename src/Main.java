public class Main {
    public static void main(String[] args) {
        int amount = 56743; // стоимость билета
        int mil = 20; // количество рублей для одной бонусной мили
        int bonus = amount / mil; // Расчет количества бонусных миль
        System.out.println("Количество бонусных миль " + bonus);
    }

}