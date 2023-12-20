package problem;

// 661. Image Smoother

//You have a grid filled with numbers, which we will call an "image".
// You are asked to create a new image where the value of each cell is the average of itself and its neighbors.
// However, if a cell doesn't have a neighbor in any direction (because it's on the edge),
// just ignore that non-existing neighbor when computing the average.
// For instance, the cell at the top left corner has
// only three neighbors (right, down-right, down),
// while a cell in the middle of the image has eight neighbors (up, down, left, right, and all the four diagonals).
//The goal is to create a new image with these averaged values. Round down the average if it's not an integer.
public class ImageSmoother {
    public static int[][] imageSmoother(int[][] img) {
        int rows = img.length;
        int cols = img[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                int totalSum = 0;
                int count = 0;
                for (int x = Math.max(0, i - 1); x < Math.min(rows, i + 2); ++x) {
                    for (int y = Math.max(0, j - 1); y < Math.min(cols, j + 2); ++y) {
                        totalSum += img[x][y];
                        count += 1;
                    }
                }

                result[i][j] = totalSum / count;
            }
        }

        return result;
    }


    public static int[][] imageSmoother1(int[][] img) {
        int res[][] = new int[img.length][img[0].length];
        for(int i = 0; i < img.length; i++) {
            for(int j = 0; j < img[0].length; j++) {
                res[i][j] = smoothen(img, i, j);
            }
        }
        return res;
    }

    static int smoothen(int[][] img, int x, int y) {
        int m = img.length;
        int n = img[0].length;
        int sum = 0;
        int count = 0;
        for(int i = -1; i <= 1; i++) {
            for(int j = -1; j <= 1; j++) {
                int nx = x + i;
                int ny = y + j;
                if(nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
                sum += img[nx][ny];
                count++;
            }
        }
        return sum/count;

    }

    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        int[][] arr2 = {
                {100, 200, 100},
                {200, 50, 200},
                {100, 200, 100}
        };
        print(imageSmoother(arr1));
        System.out.println();
        print(imageSmoother(arr2));
    }

    public static void print(int[][] arr){
        for (int[] arr1: arr){
            for (int num: arr1){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
