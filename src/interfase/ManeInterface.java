package interfase;

public class ManeInterface {

    public static void main(String[] args) {

        BaseWorker[] workers = new BaseWorker[]{new OfficeWorker("Anja"), new FactoryWorker("Donald"), new DriverWorker("Petr")};

        for (int i = 0; i < workers.length; i++) {
            BaseWorker worker = workers[i];
            work(worker);
            rest(worker);
            work(worker);
        }
    }

    public static void rest(BaseWorker worker) {
        worker.doRest();
    }

    public static void work(BaseWorker worker){
        worker.doWork();
    }

}
