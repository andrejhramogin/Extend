package arrays.homeTask;

public class Staff {
    //TODO add properties name, age, salaryRate, grade. Properties are private, access throught setters and getters.
    private String lastName;
    private String firstName;
    private int age;
    private float salaryRate;
    private int grade;

    public Staff(String lastName, String firstName, int age, float salaryRate, int grade) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.salaryRate = salaryRate;
        this.grade = grade;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public float getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(float newSalaryRate){
        salaryRate = newSalaryRate;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int newGrade){
        grade = newGrade;
    }

}
