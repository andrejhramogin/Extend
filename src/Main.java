public class Main {

    public static void main (String []args){

        SingleCellularAnimals a = new SingleCellularAnimals();

        System.out.println("a is: "+ a.getIsMulticellular());

        MultiCellularAnimals b = new MultiCellularAnimals();

        System.out.println("b is: "+ b.getIsMulticellular());

        Animal c = new SingleCellularAnimals();

        System.out.println("c is: " + c.getIsMulticellular());

        Animal d = new MultiCellularAnimals();

        System.out.println("d is: " + d.getIsMulticellular());

    }
}
