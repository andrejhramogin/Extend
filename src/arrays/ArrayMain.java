package arrays;

//import org.jetbrains.annotations.NotNull;

public class ArrayMain {

    public static void main(String[] args) {

       /* int array3[] = new int[10];
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

        System.out.println(Utils.arraySum(array3));*/

        //TODO init several array by different ways

        int newArray1[] = new int[10];
        int i;
        for (i = 0; i < 10; i++)
            newArray1[i] = i;
        //   for (i = 0; i < 10; i++)
        //       System.out.println("index [" + i + "] = " + newArray1[i]);
        Utils.arrayPrint(newArray1);
        System.out.println("Array sum: " + Utils.arraySum(newArray1));
        System.out.println("Array max value: " + Utils.arrayMax(newArray1));
        System.out.println("Array min value: " + Utils.arrayMin(newArray1));

        System.out.println();

        int newArray2[] = new int[8];
        newArray2[0] = 12;
        newArray2[1] = -14;
        newArray2[2] = 123;
        newArray2[3] = 9;
        newArray2[4] = -99;
        newArray2[5] = 2345;
        newArray2[6] = 3;
        newArray2[7] = 1;

        Utils.arrayPrint2(newArray2);
        System.out.println("Array sum: " + Utils.arraySum(newArray2));
        System.out.println("Array max value: " + Utils.arrayMax(newArray2));
        System.out.println("Array min value: " + Utils.arrayMin(newArray2));

        System.out.println();

        int newArray3[] = {22, 45, -55, 78, -5, 678, 0, 99, 100};
        Utils.arrayPrint2(newArray3);
        System.out.println("Array sum: " + Utils.arraySum(newArray3));
        System.out.println("Array max value: " + Utils.arrayMax(newArray3));
        System.out.println("Array min value: " + Utils.arrayMin(newArray3));
        Utils.arraySort(newArray3);//sorting
        System.out.print("Array after sorting: ");
        for (int index = 0; index < newArray3.length; index++) {
            System.out.print(" " + newArray3[index]);
        }

        System.out.println();
        System.out.println();

            int arrayMulti1[][] = new int[2][3];
            int v, h;
            for (v = 0; v < 2; v++) {
                h = 0;
                while (h < 3) {
                    arrayMulti1[v][h] = h;
                    System.out.println("[" + v + " : " + h + "] = " + h);
                    h++;
                }
            }


            //TODO print result all implemented methods

        }

}
