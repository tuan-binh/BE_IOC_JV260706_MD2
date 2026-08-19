package array;

public class MultidimensionalArray {
    public static void main(String[] args) {
        // Cách khởi tạo ko có giá trị
        int[][] matrix = new int[3][3];
        // Cách khởi tạo có giá trị luôn
        int[][] secondMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                System.out.print(secondMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
