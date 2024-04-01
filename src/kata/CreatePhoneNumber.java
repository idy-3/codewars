package kata;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CreatePhoneNumber {
//    Write a function that accepts an array of 10 integers (between 0 and 9), that
//    returns a string of those numbers in the form of a phone number.
//      Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"

    public static String solution(int[] numbers) {
        List<String> result = new ArrayList<>();
        result.add("(");
        for (int i = 0; i < numbers.length; i++) {
            result.add(String.valueOf(numbers[i]));
            if (i == 2) result.add(") ");
            if (i == 5) result.add("-");
        }

        return String.join("", result);
    }

    public static String solution1(int[] numbers) {
        StringBuilder result = new StringBuilder("(");

        for (int i = 0; i < numbers.length; i++) {
            result.append(numbers[i]);
            if (i == 2) result.append(") ");
            if (i == 5) result.append("-");
        }

        return result.toString();
    }

    public static String solution2(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
    }

    public static String solution3(final int[] n) {
        return "("+n[0]+n[1]+n[2]+") "+n[3]+n[4]+n[5]+"-"+n[6]+n[7]+n[8]+n[9];
    }

}
