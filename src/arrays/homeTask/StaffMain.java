package arrays.homeTask;

public class StaffMain {

    public static void main(String[] args) {

        Staff[] staff = new Staff[4]; //TODO init this array by real date
        staff[0] = new Staff("Sidorovich", "Petr", 25, 990.5f, 10);
        staff[1] = new Staff("Sidorov", "Artur", 45, 1420.6f, 15);
        staff[2] = new Staff("Ivanchuk", "Elena", 37, 1350.7f, 14);
        staff[3] = new Staff("Zhuk", "Elena", 40, 1456.7f, 18);

     //   System.out.println("Сompany employee #1: " + staff[0].getLastName() + " " + staff[0].getAge()); // printing values of Staff objects

         //TODO init company
        Company companyA = new Company("KristallInterTrans");

        Company[]companyStaff = new Company[3];
        companyStaff[0] = new Company("Sidorov", "Igor",30);
        companyStaff[1] = new Company("Vasin", "Igor", 35);
        companyStaff[2] = new Company("Petrov", "Petr", 40);


//        System.out.println("Company average age: " + companyA.averageStaffAge());
//        System.out.println("Company average salary: " + companyA.averageStaffSalary());
//        System.out.println("Company staff popular name: " + companyA.popularStaffName());
//        System.out.println("Company average name length " + companyA.averageNameLength());
    }
}
