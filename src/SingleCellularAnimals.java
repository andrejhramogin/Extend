public class SingleCellularAnimals extends Animal {

    //TODO add two new parameters for SingleCellularAnimals

    boolean isUnicellular;
    boolean isBreathable;

     public SingleCellularAnimals(){
       setIsMulticellular(false);
       setIsConsumer(true);
       setIspPhotosynthetic(false);

       setIsUnicellular(true);
       setIsBreathable(true);
     }

    //TODO Add setters and getters to properties
    public boolean getIsUnicellular(){
         return isUnicellular;
    }
    public void setIsUnicellular (boolean a){
         isUnicellular = a;
    }

    public boolean getIsBreathable (){
         return isBreathable;
    }

    public void setIsBreathable(boolean a){
         isBreathable = a;
    }

}
