package interfase.homeTask.animal;

import interfase.homeTask.food.Food;

public interface Animal {

    void doSound();
    Species[] doBreed();
    void doFeed(Food food);
}
