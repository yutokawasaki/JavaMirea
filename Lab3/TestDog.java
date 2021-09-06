package Lab3;

public class TestDog {
    public static void main(String[] args) {
        Bulldog Dog1 = new Bulldog("Бульдог", "Средний", "Средний");
        Dog1.setName("Дружок");
        System.out.println(Dog1.getWeight());
        Dog1.setWeight("Большой");
        System.out.println(Dog1.getWeight());
        Dog1.displayInfo();

        Bulldog Dog2 = new Bulldog("Бульдог", "Маленький", "Огромный");
        Dog2.setName("Дикарь");
        System.out.println(Dog2.getWeight());
        Dog2.setWeight("Гигантский");
        System.out.println(Dog2.getWeight());
        Dog2.displayInfo();
    }
}
