package interfase.homeTask.animal;

import interfase.homeTask.food.Food;

public class Lion extends Species implements Animal {

    private String petsName;

    public Lion(String speciesName, int age, String petsName) {
        super(speciesName, age);
        this.petsName = petsName;
    }

    public String getPetsName() {
        return petsName;
    }

    public void setPetsName(String newPetsName) {
        petsName = newPetsName;
    }

    @Override
    public void doSound() {
        System.out.println("lion roars: Rrrrrrrr");
    }

    @Override
    public void doFeed(Food food) {
        System.out.println("Lion eat " + food.getNameFood());
    }

    @Override
    public Species[] doBreed() {
        Species[] babyes = new Species[]{};
        return babyes;
    }
}
