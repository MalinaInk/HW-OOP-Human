public class Main {
    public static void main(String[] args) {
        Human maxim = new Human();
        maxim.town = "Минск";
        maxim.name = "Максим";
        maxim.yearOfBirth = 35;
        maxim.say();

        Human ania = new Human();
        ania.name = "Аня";
        ania.town = "Москва";
        ania.yearOfBirth = 29;
        ania.say();

        Human katia = new Human();
        katia.name = "Катя";
        katia.town = "Калининград";
        katia.yearOfBirth = 28;
        katia.say();

        Human artiom = new Human();
        artiom.name = "Артем";
        artiom.town = "Москва";
        artiom.yearOfBirth = 27;
        artiom.say();
    }
}