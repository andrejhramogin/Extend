package interfase;

public class OfficeWorker extends Person implements BaseWorker {

    public OfficeWorker(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println("OfficeWorker "+ getName()+ " is working");
    }

    @Override
    public void doRest(){
        drinkingCoffee();

    }
    public void drinkingCoffee() {
        System.out.println("Office worker " + getName() + " is drinking coffee");
    }
}
