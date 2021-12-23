public class Main {

    public static void main (String []args){

        SingleCellularAnimals a = new SingleCellularAnimals();

        System.out.println("a is: "+ a.getIsMulticellular());
        //TODO call common properties for Animal
        //TODO call specific  properties SingleCellularAnimals

        MultiCellularAnimals b = new MultiCellularAnimals();

        System.out.println("b is: "+ b.getIsMulticellular());
        //TODO call common properties for Animal
        //TODO call specific  properties MultiCellularAnimals

        Animal c = new SingleCellularAnimals();

        System.out.println("c is: " + c.getIsMulticellular());
        //TODO call common properties for Animal
        //TODO call specific  properties SingleCellularAnimals

        Animal d = new MultiCellularAnimals();

        System.out.println("d is: " + d.getIsMulticellular());
        //TODO call common properties for Animal
        //TODO call specific  properties MultiCellularAnimals
    }
}
