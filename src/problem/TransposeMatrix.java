package problem;

//867. Transpose Matrix
//        Given a 2D integer array matrix, return the transpose of matrix.
//
//        The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
//
//
//
//
//
//        Example 1:
//
//        Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//        Output: [[1,4,7],[2,5,8],[3,6,9]]
//        Example 2:
//
//        Input: matrix = [[1,2,3],[4,5,6]]
//        Output: [[1,4],[2,5],[3,6]]

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int arr[][] = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = matrix[j][i];
            }
        }
        return arr;
    }

    public static void print(int[][] arr2d){
        for (int[] arr: arr2d) {
            for (int num: arr)
                System.out.print(num + " ");
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int[][] arr1 = {
                {1,2,3},
                {4, 5, 6 },
                {7, 8, 9}
        };
         int[][] arr2 = {
                 {1, 2, 3},
                 {4, 5, 6}
         };

         int[][] arr3 = {
                 {2, 4, -1},
                 {-10, 5, 11},
                 {18, -7, 6}
         };
//         print(transpose(arr1));
         print(transpose(arr2));
//         print(transpose(arr3));

    }
}
