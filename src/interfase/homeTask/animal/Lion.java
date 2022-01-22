package interfase.homeTask.animal;

public class Lion extends Species implements Animal{

    String petsName;
    public Lion (String name, int age, String petsName){
        super(name, age);
        this.petsName = petsName;
    }

    public String getPetsName(){
        return petsName;
    }

    public void setPetsName(String newPetsName){
        petsName = newPetsName;
    }

    @Override
    public void doSound(){

    }

    @Override
    public void doFeed(){

    }

    @Override
    public void doBreed(){
    }
}
