public class Main {
    public static void main(String[] args) {
        Human maxim = new Human();
        maxim.town = "Минск";
        maxim.name = "Максим";
        maxim.yearOfBirth = 35;
        maxim.job = "бренд-менеджер";
        maxim.say();

        Human ania = new Human();
        ania.name = "Аня";
        ania.town = "Москва";
        ania.yearOfBirth = 29;
        ania.job = "методист образовательных программ";
        ania.say();

        Human katia = new Human();
        katia.name = "Катя";
        katia.town = "Калининград";
        katia.yearOfBirth = 28;
        katia.job = "продакт-менеджер";
        katia.say();

        Human artiom = new Human();
        artiom.name = "Артем";
        artiom.town = "Москва";
        artiom.yearOfBirth = 27;
        artiom.job = "директор по развитию бизнеса";
        artiom.say();
    }
}