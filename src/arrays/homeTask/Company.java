package arrays.homeTask;

public class Company {

    private Company[] companyStaff;
    private String companyName;
    private String lastName;
    private String firstName;
    int age;

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public Company(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String newCompanyName) {
        companyName = newCompanyName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    //TODO add constructor that accept staff how param

    //TODO add property staff

    //TODO implement methods

    public int averageStaffAge() {  // как я представляю, данные для вычислений в этом методе должны прийти из
                                    // массива Company[]companyStaff = new Company[3];, созданного в StaffMain?
        int averageStaffAge = 0;
        int sumAge = 0;
        for (int i = 0; i < companyStaff.length; i++) { // откуда будет известна длина массива, если он инициируется в StaffMain?
            sumAge = sumAge + ?; //сюда нужно вставить значения "age", просетанные в StaffMain?

        }
        averageStaffAge = sumAge / companyStaff.length;
        return averageStaffAge;
    }
//
//    public float averageStaffSalary() {
//
//    }
//
//    public String popularStaffName() {
//
//    }
//
//    public int averageNameLength() {
//
//    }

}