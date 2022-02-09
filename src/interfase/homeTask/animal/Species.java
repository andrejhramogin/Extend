package interfase.homeTask.animal;

import interfase.homeTask.food.Food;

public abstract class Species implements Animal {

    private int maxBabyesNumber;

    private String speciesName;
    private String babyName;
    private int speciesAge;
    private Food[] speciesFoods;

    public Species(String speciesName, int speciesAge, Food[]speciesFoods) {
        this.speciesName = speciesName;
        this.speciesAge = speciesAge;
        this.speciesFoods = speciesFoods;
    }

    public Species(String speciesName, String babyName){
        this.speciesName = speciesName;
        this.babyName = babyName;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String newSpeciesName) {
        speciesName = newSpeciesName;
    }

    public String getBabyName(){
        return babyName;
    }

    public void setBabyName(String newBabyName){
        babyName = newBabyName;
    }

    public int getSpeciesAge() {
        return speciesAge;
    }

    public void setSpeciesAge(int newSpeciesAge) {
        speciesAge = newSpeciesAge;
    }

    public Food[] getSpeciesFoods() {
        return speciesFoods;
    }

    public void setSpeciesFoods(Food[] speciesFoods) {
        this.speciesFoods = speciesFoods;
    }
}
