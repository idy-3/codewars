package kata;

import java.util.ArrayList;

public class BreakCamelCase {

    public static String camelCase(String input) {
        var result = new ArrayList<String>();

        var tempIdx = -1;
        var idx = 0;
        while (idx < input.length()){
            if(Character.isUpperCase(input.charAt(idx))){
                if (tempIdx < 0){
                    result.add(input.substring(0, idx));
                }else {
                    result.add(input.substring(tempIdx, idx));
                }
                tempIdx = idx;
            }
            idx++;
        }
        if (tempIdx < 0)
            return input;

        result.add(input.substring(tempIdx));
        return String.join(" ", result);
    }

    public static String camelCase1(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }

    public static String camelCase2(String input) {
        var separated = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                separated.append(' ');
            }
            separated.append(c);
        }
        return separated.toString();
    }

    public static String camelCase3(String input) {
        return String.join(" ", input.split("(?=[A-Z])"));
    }

}
