package problem;

public class Weekly {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length * grid[0].length;
        int[] arr = new int[n];
        int l = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j< grid[i].length; j++){
                arr[l++] = grid[i][j];
            }
        }


        int[] temp = new int[n];
        int r = -1;
        int m = -1;

        for (int i = 0; i < n; i++) {
            temp[arr[i] - 1]++;
            if (temp[arr[i] - 1] > 1) {
                r = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (temp[i] == 0) {
                m = i + 1;
                break;
            }
        }

        int[] result = {r, m};
        return result;

    }
}
