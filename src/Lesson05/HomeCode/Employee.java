package Lesson05.HomeCode;

public class Employee {

    private static final int CURRENT_YEAR = 2021;

    private String name;
    private String surname;
    private String patronimic;
    private String occupation;
    private String email;
    private String number;
    private int salary;
    private int birthYear;

    public Employee(String surname, String name, String patronimic, String occupation, String email, String number, int salary, int birthYear) {
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.occupation = occupation;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronimic() {
        return patronimic;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return CURRENT_YEAR - birthYear;
    }

    String getFullInfo() {
        return this.surname + " " + this.name + " " + this.patronimic + ", " +
                this.getAge() + " years old, " +
                this.occupation + ". Email: " +
                this.email + ". Phone number: " +
                this.number + ". Salary is " +
                this.getSalary() + " rubles.";
    }
}
