package arrays.homeTask;

public class Company {

    private Staff[] companyStaff;
    private String companyName;


    public Company(Staff[] companyStaff) {
        this.companyStaff = companyStaff;
    }

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public Staff[] getCompanyStaff() {
        return companyStaff;
    }

    public void setCompanyStaff(Staff[] companyStaff) {
        this.companyStaff = companyStaff;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String newCompanyName) {
        companyName = newCompanyName;
    }

    //TODO add constructor that accept staff how param

    //TODO add property staff

    //TODO implement methods

    public float averageStaffAge() {
        float averageStaffAge;
        int sumAge = 0;

        for (int i = 0; i < companyStaff.length; i++) {
            sumAge = sumAge + companyStaff[i].getAge();
        }

        averageStaffAge = sumAge / (float) companyStaff.length;

        return averageStaffAge;
    }


    public float averageStaffSalary() {
        float averageStaffSalary;
        float sumSalary = 0;
        for (int i = 0; i < companyStaff.length; i++) {
            sumSalary = sumSalary + companyStaff[i].getSalaryRate();
        }
        averageStaffSalary = sumSalary / companyStaff.length;
        return averageStaffSalary;
    }

    public String popularStaffName() {
        int counter = 0;
        int popularNameCounter = 1;
        String popularName = null;

        for (int i = 0; i < companyStaff.length; i++) {
            String currentName = companyStaff[i].getFirstName();
            counter = 0;
            for (int j = 0; j < companyStaff.length; j++) {
                String name = companyStaff[j].getFirstName();
                if (currentName == name) {
                    counter++;
                }
            }

            if (counter > popularNameCounter) {
                popularNameCounter = counter;
                popularName = currentName;
            }

            else {
                popularName = "All names are different.";
            }
        }

        return popularName;
    }
//
//    public int averageNameLength() {
//
//    }

}