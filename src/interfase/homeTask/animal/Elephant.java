package interfase.homeTask.animal;

import interfase.homeTask.food.Food;


public class Elephant extends Species implements Animal {

    private String petsName;

    public Elephant(String speciesName, int speciesAge, String petsName) {

        super(speciesName, speciesAge);
        this.petsName = petsName;
    }

    public Elephant (String speciesName , String babyName){
        super(speciesName, babyName);
    }

    public String getPetsName() {
        return petsName;
    }

    public void setPetsName(String newPetsName) {
        petsName = newPetsName;
    }

    @Override
    public void doSound() {
        System.out.println("Elephant trumpets: Uuuuuu!");
    }

    @Override
    public void doFeed(Food food) {
        System.out.println("Elephant " + "\"" + getPetsName() + "\"" + " eating " + food.getNameFood());
    }

    @Override
    public Species[] doBreed() {
        Species[] babyes = {new Elephant("African elephant","Baby elephant")};
        return babyes;
    }
}
