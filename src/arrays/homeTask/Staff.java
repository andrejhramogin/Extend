package arrays.homeTask;

public class Staff {
    //TODO add properties name, age, salaryRate, grade. Properties are private, access throught setters and getters.
    private String name;
    private int age;
    private float salaryRate;
    private int grade;

    public Staff(String name, int age, float salaryRate, int grade) {
        this.name = name;
        this.age = age;
        this.salaryRate = salaryRate;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
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
