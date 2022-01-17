package arrays.homeTask;

public class Company {

    private ItStaff[] companyStaff;
    private String companyName;


    public Company(ItStaff[] companyStaff) {
        this.companyStaff = companyStaff;
    }

    public ItStaff[] getCompanyStaff() {
        return companyStaff;
    }

    public void setCompanyStaff(ItStaff[] companyStaff) {
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

    //
//    public float averageStaffSalary() {
//
//    }
//
    public String popularStaffName() {
        int counter = 0;
        int popularNameCounter= 0;
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

            if (counter>popularNameCounter){
                popularNameCounter = counter;
                popularName = currentName;
            }
        }

        return popularName;
    }
//
//    public int averageNameLength() {
//
//    }

}