import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    int minRecord = scores.get(0);
        int maxRecord = scores.get(0);
        int minCount = 0;
        int maxCount = 0;

        // Iterate through the scores starting from the second game
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) < minRecord) {
                // Update the minimum record and increment the minimum record break count
                minRecord = scores.get(i);
                minCount++;
            } else if (scores.get(i) > maxRecord) {
                // Update the maximum record and increment the maximum record break count
                maxRecord = scores.get(i);
                maxCount++;

    }

}
        List<Integer> result = new ArrayList<>();
        result.add(maxCount);
        result.add(minCount);

        return result;
    }
}