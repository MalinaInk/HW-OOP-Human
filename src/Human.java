public class Human {
   private int yearOfBirth;
   String name;
   private String town;
   String job;


   Human(String name, String town, String job, int yearOfBirth) {
      if (name == null || name.isEmpty()) {
         this.name = " Информация не указана ";
      } else {
         this.name = name;
      }

      if (job == null || job.isEmpty()) {
         this.job = " Информация не указана ";
      } else {
         this.job = job;
      }
      if (town == null || town.isEmpty()) {
         this.town = " Информация не указана ";
      } else {
         this.town = town;
      }

      if (2022 - yearOfBirth > 0) {
         this.yearOfBirth = 2022 - yearOfBirth;
      } else {
         this.yearOfBirth = 0;
      }
   }


       void say() {
         System.out.println("Привет! Меня зовут " + name +
                 ". Я из города " + getTown() + ". Я родился в " + getYearOfBirth() +
                 " году. Я работаю на должности " + job + ". Будем знакомы!");
      }

   public int getYearOfBirth() {
      return yearOfBirth;
   }

   public String getTown() {
      return town;
   }

   public void setYearOfBirth(int yearOfBirth) {
      if (2022 - yearOfBirth > 0) {
         this.yearOfBirth = 2022 - yearOfBirth;
      } else {
         this.yearOfBirth = 0;
      }
   }

   public void setTown(String town) {
      if (town == null || town.isEmpty()) {
         this.town = " Информация не указана ";
      } else {
         this.town = town;
      }
   }
}


