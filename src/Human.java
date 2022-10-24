public class Human {
   int yearOfBirth;
   String name;
   String town;


   void say() {
      System.out.println("Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + (2022-yearOfBirth) + " году. Будем знакомы!");
   }
}
