public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим","Минск","бренд-менеджер", 2035);
        maxim.say();

        Human ania = new Human("Аня", null, "методист образовательных программ", 29);
        ania.say();

        Human katia = new Human("Катя","Калининград","", 28);
        katia.say();

        Human artiom = new Human("Артем","Москва","директор по развитию бизнеса", 27);
        artiom.say();
    }
}