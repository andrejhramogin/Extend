package arrays.homeTask;

public class StaffMain {

    public static void main(String[] args) {

        ItStaff[] staff = new ItStaff[4]; //TODO init this array by real date
        staff[0] = new ItStaff("Sidorovich", "Petr", 25, 990.5f, 10);
        staff[3] = new ItStaff("Sidorov", "Artur", 45, 1420.6f, 15);
        staff[2] = new ItStaff("Ivanchuk", "Elena", 37, 1350.7f, 14);
        staff[1] = new ItStaff("Zhuk", "Elena", 40, 1456.7f, 18);

        //   System.out.println("Сompany employee #1: " + staff[0].getLastName() + " " + staff[0].getAge()); // printing values of Staff objects

         //TODO init company
        Company companyA = new Company(staff);


          System.out.println("Company average age: " + companyA.averageStaffAge());
//        System.out.println("Company average salary: " + companyA.averageStaffSalary());
        System.out.println("Company staff popular name: " + companyA.popularStaffName());
//        System.out.println("Company average name length " + companyA.averageNameLength());
    }
}
