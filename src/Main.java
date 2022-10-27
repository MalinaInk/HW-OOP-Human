public class Main {
    public static void main(String[] args) {

        Flower rosa = new Flower(null, "Голландия", 35.59);
        Flower chrisantema = new Flower(null, null, 15, 5);
        Flower pion = new Flower(null, "Англия", 69.9, 1);
        Flower hipsofila = new Flower(null, "Турция", 19.5, 10);
        printInfo(rosa);
        printInfo(chrisantema);
        printInfo(pion);
        printInfo(hipsofila);
        printCostFlowers(
                rosa, rosa, rosa,
                chrisantema, chrisantema, chrisantema, chrisantema, chrisantema,
                hipsofila
        );

        Human maxim = new Human("Максим","Минск","бренд-менеджер", 2035);
        maxim.say();

        Human ania = new Human("Аня", null, "методист образовательных программ", 29);
        ania.say();

        Human katia = new Human("Катя","Калининград","", 28);
        katia.say();

        Human artiom = new Human("Артем","Москва","директор по развитию бизнеса", 27);
        artiom.say();

        Human vladimir = new Human("Владимир","Казань",null, 27);
        vladimir.say();
    }

    private static void printInfo(Flower flower) {
        System.out.println("Цвет - " + flower.getFlowerColor() + ". Страна происхождения - " +
                flower.getCountry() + ". Стоимость - " + flower.getCost() + ". Срок стояния - " + flower.lifeSpan);
        }

    private static void printCostFlowers(Flower... flowers) {
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minimumLifeSpan) {
                minimumLifeSpan = flower.lifeSpan;
                }
            totalCost += flower.getCost();
            printInfo(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Срок стояния букета: " + minimumLifeSpan);
    }
}