package interfase.homeTask.animal;

import interfase.homeTask.zoo.Zoo;

public class Main {
    public static final int YEAR_LENGTH = 365;

    public static void main(String[] args) {

        Zoo berlinZoo = new Zoo(new Species[]{
                new Lion("Lion", 5, "King"),
                new Eagle("Golden eagle", 5, "Fast"),
                new Elephant("African elephant", 25, "Little mouse")});

        for (int dayNumber = 0; dayNumber <= YEAR_LENGTH; dayNumber++) {
            berlinZoo.oneDayAction(dayNumber);
        }
    }
}
