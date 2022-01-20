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

        int popularNameCounter = 1;
        String popularName = "None of the names are more popular than the others.";

        for (int i = 0; i < companyStaff.length; i++) {
            String currentName_i = companyStaff[i].getFirstName();

            int counter = 0;
            for (int j = 0; j < companyStaff.length; j++) {
                String currentName_j = companyStaff[j].getFirstName();
                if (currentName_i == currentName_j) {
                    counter++;
                }
            }

            if (counter > popularNameCounter) {
                popularName = currentName_i;
            }
        }

        return popularName;
    }

    public float averageNameLength() {
        float averageNameLength;
        float totalLengthOfNames = 0;
        int currentNameLength;

        for (int i = 0; i < companyStaff.length; i++) {
            currentNameLength = companyStaff[i].getFirstName().length();
            totalLengthOfNames += currentNameLength;
        }

        averageNameLength = totalLengthOfNames / companyStaff.length;
        return averageNameLength;
    }
}