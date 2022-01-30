package interfase.homeTask.animal;

public abstract class Species implements Animal {

    private String speciesName;
    private String babyName;
    private int speciesAge;

    public Species(String speciesName, int speciesAge) {
        this.speciesName = speciesName;
        this.speciesAge = speciesAge;
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

    public void setBabyName(String newBabiesName){
        babyName = newBabiesName;
    }

    public int getSpeciesAge() {
        return speciesAge;
    }

    public void setSpeciesAge(int newSpeciesAge) {
        speciesAge = newSpeciesAge;
    }

}
