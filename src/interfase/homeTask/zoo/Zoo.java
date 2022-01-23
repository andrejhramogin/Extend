package interfase.homeTask.zoo;

import interfase.homeTask.animal.Species;
import interfase.homeTask.food.Food;
import interfase.homeTask.food.vegetables.Carrot;
import interfase.homeTask.food.vegetables.Potato;
import interfase.homeTask.food.fishes.Kilka;
import interfase.homeTask.food.fishes.Tuna;

public class Zoo {
    private Species[] pets = new Species[]{};

    public Zoo(Species[] pets) {
        this.pets = pets;
    }

    public Species[] getPets() {
        return pets;
    }

    public void setPets(Species[] pets) {
        this.pets = pets;
    }

    public void oneDayAction (){
        openZoo();
        cleaning();
        feeding();

    }

    private void openZoo() {
        System.out.println("Zoo is open");
    }

    private void cleaning(){
        System.out.println("Cleaning");
    }

    private void feeding(){
        Food[] foods = new Food[]{new Tuna(), new Kilka(), new Potato(), new Carrot()};
        for (int i = 0; i< pets.length; i++){
            Species pet = pets[i];
            pet.doFeed(foods[2]);
        }
    }
}
