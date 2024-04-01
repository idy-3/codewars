package kata;

import java.util.Arrays;

public class HighAndLow {

    public static String solution(String numbers) {

        // --> solution 1
        var maxNum = Integer.MIN_VALUE;
        var minNum = Integer.MAX_VALUE;
        for (var c : numbers.split(" ")) {

            var temp = Integer.parseInt(c);
            if (temp > maxNum) {
                maxNum = temp;
            }
            if (temp < minNum) {
                minNum = temp;
            }
        }

        return maxNum + " " + minNum;
    }

    public static String solution1(String numbers) {

        // --> solution 2
        var maxNum = Integer.MIN_VALUE;
        var minNum = Integer.MAX_VALUE;
        for (var c : numbers.split(" ")) {
            maxNum = Integer.max(maxNum, Integer.parseInt(c));
            minNum = Integer.min(minNum, Integer.parseInt(c));
        }
        return maxNum + " " + minNum;
    }

    public static String solution2(String numbers) {

        var stats = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        return stats.getMax() + " " + stats.getMin();

    }
}
