
public class Main {
    public static void main(String[] args) {

        int balance = 20;
        int amount1 = 500;
        int amound2 = 2000;

        int bonus1;
        if (amount1 > 1000) {
            bonus1 = amount1 / 100;
        } else {
            bonus1 = 0;
        }

        System.out.println("1 Сценарий:" +
                        "  Бонусы:" + bonus1 +
                "  Быланс:" + (balance + bonus1 + amount1));

        int bonus2;
        if (amound2 > 1000) {
            bonus2 = amound2 / 100;
        } else {
            bonus2 = 0;
        }

        System.out.println("2 Сценарий:" +
                "  Бонусы:" + bonus2 +
                "  Быланс:" + (balance + bonus2 + amound2));
    }
}
