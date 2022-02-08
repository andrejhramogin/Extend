package interfase.homeTask.zoo;

import interfase.homeTask.animal.Species;
import interfase.homeTask.food.Food;
import interfase.homeTask.food.fishes.Kilka;
import interfase.homeTask.food.fishes.Tuna;
import interfase.homeTask.food.meat.Beef;
import interfase.homeTask.food.meat.Pork;
import interfase.homeTask.food.vegetables.Carrot;
import interfase.homeTask.food.vegetables.Potato;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static final int BREEDING_DAY = 199;

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

    public void oneDayAction(int dayNumber) {
        openZoo();
        cleaning();

        feeding();
        sounding();
        breeding(dayNumber);
    }

    private void openZoo() {
        System.out.println("Zoo is open");
    }

    private void cleaning() {
        System.out.println("Cleaning");
    }

    private Food [] preparingFood (){
        Food[] foods = new Food[]{new Tuna(), new Kilka(), new Potato(), new Carrot(), new Beef(), new Pork()};
        return foods;
    }

    private void feeding() {
// 1. Взять набор еды
        Food[] foods = preparingFood();
// 2. Извлечь животное
        for (int i = 0; i< pets.length; i++){
            Species animal = pets[i];
        }
// 3. Взять соотв. животному виды еды

// 4. Взять какой-либо один вид еды.
// 5. Покормить жив-ое.
    }

    private Food[] takeSpeciesFood(Species a, Food[]b){
        List<Food> finalFoodArray = new ArrayList<>();
        for (int i = 0; i < b.length; i++){
            Food f = b[i];
            Food[] arrayFood = a.getSpeciesFoods();
            for (int j = 0; j< arrayFood.length; j++){
                Food c = arrayFood[j];
                if (f.getNameFood()==c.getNameFood()){
                    finalFoodArray.add(f);
                }
            }
        }

        return (Food[]) finalFoodArray.toArray();
    }

    private void sounding() {
        for (int i = 0; i < pets.length; i++) {
            Species pet = pets[i];
            pet.doSound();
        }
    }

    private void breeding(int dayNumber) {
        if (dayNumber == BREEDING_DAY) {

            for (int i = 0; i < pets.length; i++) {
                Species pet = pets[i];
                Species[] babyes = pet.doBreed();

                for (int j = 0; j < babyes.length; j++) {
                    Species baby = babyes[j];
                    System.out.println("Was born new " + baby.getBabyName());
                }
            }
        }
    }
}
