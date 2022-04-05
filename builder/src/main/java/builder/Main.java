package src.main.java.builder;

public class Main {

  public static void main(String[] args) {
    Employee engineerEmployee = new Employee.Builder(Profession.ENGINEER, "Kek", "Lolskiy")
        .withAge(40)
        .withClothes(Clothes.SHIRT)
        .withShoes(Shoes.HEELS)
        .build();

    Employee recruiterEmployee = new Employee.Builder(Profession.RECRUITER, "Recruiter", "The best")
        .withAge(20)
        .withClothes(Clothes.Dress)
        .withShoes(Shoes.SNEAKERS)
        .build();

    System.out.println(engineerEmployee);
    System.out.println(recruiterEmployee);
  }
}
