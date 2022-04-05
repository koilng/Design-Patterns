package src.main.java.builder;


public class Employee {

    private final Profession profession;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final Clothes clothes;
    private final Shoes shoes;

    private Employee(Builder builder) {
        this.profession = builder.profession;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.clothes = builder.clothes;
        this.shoes = builder.shoes;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "profession=" + profession +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", age=" + age +
            ", clothes=" + clothes +
            ", shoes=" + shoes +
            '}';
    }

    public static class Builder {
        private final Profession profession;
        private final String firstName;
        private final String lastName;
        private int age;
        private Clothes clothes;
        private Shoes shoes;

        public Builder(Profession profession, String firstName, String lastName) {
            if (profession == null | firstName == null | lastName == null) {
                throw new IllegalArgumentException("fields can not be null");
            }
            this.profession = profession;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withClothes(Clothes clothes) {
            this.clothes = clothes;
            return this;
        }

        public Builder withShoes(Shoes shoes) {
            this.shoes = shoes;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
