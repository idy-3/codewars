package kata;

public class PrimeChecker {
//    private final Integer numToCheck = 13;

    public static String checker(Integer numToCheck){
        var numFactors = 0;
        var test = 2;

        while (test * test <= numToCheck){
            if (numToCheck % test == 0){
                numFactors += 1;
            }
            test += 1;
        }

        if (numFactors > 0){
            return numToCheck+" is not a prime";
        }else {
            return numToCheck+" is a prime";
        }
    }
}
