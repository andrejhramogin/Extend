package interfase.homeTask.food;

public abstract class Food {

    private String nameFood;
    private int calories;

    public Food(String nameFood, int calories) {
        this.nameFood = nameFood;
        this.calories = calories;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
