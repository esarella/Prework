import java.util.ArrayList;

public class Checkpoint3 {
    public int numRange(ArrayList<Integer> a, int b, int c) {
        int counter = 0;
        int result = 0;

        for (int i = 0; i < a.size(); i++) {
            result = a.get(i);
            if (result >= b && result <= c) {
                counter++;
            }

            int k = i + 1;

            while (k < a.size()) {
                result = result + a.get(k);
                if (result >= b && result <= c) {
                    counter++;
                } else if (result > c) {
                    break;
                }
                k++;
            }
        }
        return counter;
    }
}
