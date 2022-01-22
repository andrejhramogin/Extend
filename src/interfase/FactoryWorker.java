package interfase;

public class FactoryWorker extends Person implements BaseWorker {

    public FactoryWorker(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println("FactoryWorker " + getName() + " is working");
    }

    @Override
    public void doRest(){
        smoking();
    }

    public void smoking() {
        System.out.println("Factory worker " + getName() + " is smoking");
    }
}
