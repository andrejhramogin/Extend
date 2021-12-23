public class Main {

    public static void main (String []args){

        SingleCellularAnimals a = new SingleCellularAnimals();

        System.out.println("a is: "+ a.getIsMulticellular());

        MultiCellularAnimals b = new MultiCellularAnimals();

        System.out.println("b is: "+ b.getIsMulticellular());

        Animal c = new MultiCellularAnimals();

        System.out.println("c is: "+ c.getIsMulticellular());
    }
}
