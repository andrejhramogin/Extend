package interfase.homeTask.animal;

import interfase.homeTask.food.Food;
import interfase.homeTask.food.meat.Beef;
import interfase.homeTask.food.meat.Pork;

public class Lion extends Species implements Animal {

    private static final Food[] LION_FOOD = new Food[]{new Pork(), new Beef()};

    private String petsName;

    public Lion(String speciesName, int age, String petsName) {
        super(speciesName, age, LION_FOOD);
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
