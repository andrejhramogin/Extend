package interfase.homeTask.animal;

import interfase.homeTask.food.Food;

public class Elephant extends Species implements Animal {

    private String petsName;

    public Elephant (String speciesName, int speciesAge, String petsName){

        super(speciesName, speciesAge);
        this.petsName = petsName;
    }

    public String getPetsName(){
        return petsName;
    }

    public void setPetsName (String newPetsName){
        petsName = newPetsName;
    }

    public void doSound(){
        System.out.println("Uuuuuu!");
    }

    public void doFeed(Food food){
        System.out.println("Elephant " +"\""+ getPetsName()+"\"" + " eating "+ food.getNameFood());
    }

    public Species[] doBreed(){
        Species[] babyes = new Species[]{};
        return babyes;
    }
}
