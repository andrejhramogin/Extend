public class MultiCellularAnimals extends Animal {

    //TODO add two new parameters for MultiCellularAnimals
    private boolean isBreeding;
    private boolean isUnicellular;


    public MultiCellularAnimals() {
        setIsMulticellular(true);
        setIsConsumer(true);
        setIspPhotosynthetic(false);
    }

    //TODO Add setters and getters to properties

    public boolean getIsBreeding() {
        return isBreeding;
    }
    public void setIsBreeding(boolean a){
        isBreeding = a;
    }

    public boolean getIsUnicellular(){
        return isUnicellular;
    }

    public void setIsUnicellular(boolean a){
        isUnicellular = a;
    }

}
