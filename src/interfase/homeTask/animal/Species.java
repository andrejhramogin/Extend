package interfase.homeTask.animal;

public abstract class Species implements Animal {

    private String speciesName;
    private int speciesAge;

    public Species(String speciesName, int speciesAge) {
        this.speciesName = speciesName;
        this.speciesAge = speciesAge;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String newSpeciesName) {
        speciesName = newSpeciesName;
    }

    public int getSpeciesAge() {
        return speciesAge;
    }

    public void setSpeciesAge(int newSpeciesAge) {
        speciesAge = newSpeciesAge;
    }

}
