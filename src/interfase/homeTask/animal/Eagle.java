package interfase.homeTask.animal;

import interfase.homeTask.food.Food;

public class Eagle extends Species implements Animal{

    String petsName;

    public Eagle(String name, int age, String petsName){
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
        System.out.println("Kli Kli");
    }

    @Override
    public void doFeed(Food food){
        System.out.println("Eagle eat " + food.getNameFood());
    }

    @Override
    public Species[] doBreed(){
        Species[]babyes=new Species[]{};
        return babyes;
    }
}
