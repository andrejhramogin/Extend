package interfase;

public class DriverWorker extends Person implements BaseWorker {

    public DriverWorker (String name){
        super (name);
    }

    @Override
    public void doWork(){
        System.out.println("Driver " + getName() + " is driving");
    }

    @Override
    public void doRest(){
        driverSleep();
        driverDrink();
    }

    public void driverSleep (){
        System.out.println("Driver " + getName() + " is sleeping");
    }

    public void driverDrink(){
        System.out.println("Driver "+ getName()+" is drinking");
    }
}
