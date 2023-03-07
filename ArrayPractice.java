import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        String[][] seatingChart = {{"Abby", "Don", "George", "Kim"}, {"Brian", "Elenor", "Harry", "Lenny"}, {"Cathy", "Fred", "Jill", "Matt"}};

        seatingChart[1][2] = "Paul";

        String temp = seatingChart[2][3];
        seatingChart[2][3] = seatingChart[0][0];
        seatingChart[0][0] = temp;

        String[] temp2 = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = temp2;

        for (String[] row : seatingChart) {
            System.out.println(Arrays.toString(row));
        }


        int[][] array1 = new int[2][3];
        int[][] array2 = new int[3][2];

        array1[0][0] = 1;
        array1[0][1] = 2;
        array1[0][2] = 3;
        array1[1][0] = 4;
        array1[1][1] = 5;
        array1[1][2] = 6;

        for (int[] innerArray : array1) {
            System.out.println(Arrays.toString(innerArray));
        }

        array2[0][0] = 1;
        array2[0][1] = 4;
        array2[1][0] = 2;
        array2[1][1] = 5;
        array2[2][0] = 3;
        array2[2][1] = 6;

        for (int[] innerArray : array2) {
            System.out.println(Arrays.toString(innerArray));
        }
    }
}
