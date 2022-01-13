package arrays;

public class ArrayMain {

    public static void main(String[] args) {

        int array3[] = new int[10];
        array3[0] = 1;
        array3[5] = 777;

        int[] array2 = new int[9];
        array2[0] = 10;
        array2[1] = 12;

        System.out.println("array3: " + array3);
        System.out.println("array2: " + array2.toString());

        Utils.arrayPrint(array3);
        System.out.println();
        Utils.arrayPrint(array2);

        System.out.println(Utils.arraySum(array3));

    }
}
