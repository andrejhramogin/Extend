package arrays.homeTask;

public class FactoryStaff implements IStaff{
    public String firstname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void doSomething(){
        System.out.println(firstname + " work");
    }
}
