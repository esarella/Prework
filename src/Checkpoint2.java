import java.util.ArrayList;

public class Checkpoint2 {
    public ArrayList<ArrayList<Integer>> prettyPrint(int a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (a <= 0) return result;

        int n = 2 * a - 1;
        int[][] matrix = new int[n][n];
        int layers = a;

        for (int i = 0; i < layers; i++) {
            if (i == layers - 1) {
                matrix[i][i] = a;
            } else {
                for (int j = i; j < n - 1 - i; j++) {
                    matrix[i][j] = a;
                    matrix[j][n - 1 - i] = a;
                    matrix[n - 1 - i][n - 1 - j] = a;
                    matrix[n - 1 - j][i] = a;
                }
            }
            a--;
        }

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> l = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                l.add(matrix[i][j]);
            }
            result.add(l);
        }

        return result;
    }
}
