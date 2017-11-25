import java.util.HashMap;
import java.util.List;

public class Checkpoint5 {
    public int longestConsecutive(final List<Integer> a) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : a) {
            if (!map.containsKey(n)) {
                int left = (map.containsKey(n - 1)) ? map.get(n - 1) : 0;
                int right = (map.containsKey(n + 1)) ? map.get(n + 1) : 0;
                int sum = left + right + 1;
                map.put(n, sum);

                res = Math.max(res, sum);

                map.put(n - left, sum);
                map.put(n + right, sum);
            }
        }
        return res;
    }
}
