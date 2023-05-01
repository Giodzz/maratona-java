package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[] {2, 5, 7, 8, 9, 2, 4};

        int[][] arrayInt2 = {
                {1, 2},
                {3, 4, 5},
                {6, 7, 8, 9, 10}
        };

        for (int[] arrBase: arrayInt) {
            for (int num: arrBase) {
                System.out.println(num);
            }
        }
    }
}
