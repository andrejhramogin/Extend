package interfase.homeTask.animal;

import interfase.homeTask.zoo.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo berlinZoo = new Zoo(new Species[]{
                new Lion("lion", 5, "King"),
                new Eagle("Golden eagle", 5, "Fast"),
                new Elephant("African elephant", 25, "Little mouse")});

        for (int i = 0; i <= 5; i++) {
            berlinZoo.oneDayAction();
        }
    }
}
