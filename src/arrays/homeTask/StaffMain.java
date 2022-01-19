package arrays.homeTask;

public class StaffMain {

    public static void main(String[] args) {

        Staff[] staff = new Staff[4]; //TODO init this array by real date
        staff[0] = new Staff("Sidorovich", "Petr", 25, 990.5f, 10);
        staff[3] = new Staff("Sidorov", "Evgenij", 45, 1420.6f, 15);
        staff[2] = new Staff("Ivanchuk", "Elena", 37, 1350.7f, 14);
        staff[1] = new Staff("Zhuk", "Alexandra", 40, 1456.7f, 18);

        for (int i = 0; i < staff.length; i++) {
            System.out.print("Сompany employee #" + (i + 1) + " :" + staff[i].getLastName() + " " + staff[i].getFirstName());
            System.out.println(", age " + staff[i].getAge() + "."); // printing values of Staff objects
        }

        Company companyName = new Company("Kristall");
        System.out.println("Company name: " + companyName.getCompanyName());

        Company companyA = new Company(staff);

        System.out.println("Company average age: " + companyA.averageStaffAge());
        System.out.println("Company average salary: " + companyA.averageStaffSalary());
        System.out.println("Company staff popular name: " + companyA.popularStaffName());
        System.out.println("Company average name length " + companyA.averageNameLength());
    }
}
