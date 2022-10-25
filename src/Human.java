public class Human {
   int yearOfBirth;
   String name;
   String town;
   String job;

   Human(String name, String town, String job, int yearOfBirth) {
      if (name == null || name.isEmpty()) {
         this.name = " Информация не указана ";
      } else {  this.name = name;
      }

      if (town == null || town.isEmpty()) {
         this.town = " Информация не указана ";
      } else { this.town = town;
      }

      if (job == null || job.isEmpty()) {
         this.job = " Информация не указана ";
      } else {         this.job = job;
      }

      if (2022 - yearOfBirth > 0) {
         this.yearOfBirth = 2022 - yearOfBirth;
      } else {
         this.yearOfBirth = 0;
      }
   }

       void say() {
         System.out.println("Привет! Меня зовут " + name +
                 ". Я из города " + town + ". Я родился в " + yearOfBirth +
                 " году. Я работаю на должности " + job + ". Будем знакомы!");
      }
   }

