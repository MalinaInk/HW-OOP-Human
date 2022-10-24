public class Human {
   int yearOfBirth;
   String name;
   String town;
   String job;

   Human(String name, String town, String job, int yearOfBirth) {
      this.name = name;
      this.town = town;
      this.job = job;
      this.yearOfBirth = yearOfBirth;
   }
   void say() {
      System.out.println("Привет! Меня зовут " + name +
              ". Я из города " + town + ". Я родился в " + (2022-yearOfBirth) +
              " году. Я работаю на должности " + job + ". Будем знакомы!");
   }
}
