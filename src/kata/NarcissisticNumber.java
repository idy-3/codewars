package kata;

public class NarcissisticNumber {
//        A Narcissistic Number (or Armstrong Number) is a positive number
//        which is the sum of its own digits, each raised to the power of the number
//        of digits in a given base. In this kata.HighAndLow, we will restrict ourselves to decimal
//        (base 10).
//        For example, take 153 (3 digits), which is narcissistic:
//                  1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

    public static boolean isNarcissistic(int number) {

        var length = (int) (Math.log10(number) + 1);
        int testNum = number;
        int total = 0;

        while(testNum > 0){
            total += (int) Math.pow((testNum % 10), length);
            testNum /= 10;
        }

        return total == number;
    }
}
