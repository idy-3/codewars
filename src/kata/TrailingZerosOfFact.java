package kata;

public class TrailingZerosOfFact {
    // Write a program that will calculate the number of trailing zeros in a factorial of a given number.
    //
    //  N! = 1 * 2 * 3 *  ... * N
    //
    // Be careful 1000! has 2568 digits...
    //
    //      zeros(6) = 1
    //      # 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720 --> 1 trailing zero
    //
    //      zeros(12) = 2
    //      # 12! = 479001600 --> 2 trailing zeros
    //
    // Hint: You're not meant to calculate the factorial. Find another way to find the number of zeros.

    public static int zeros(int n) {

        var result = 0;
        while (n >= 5) {
            n = n / 5;
            result += n;
        }
        return result;
    }

    public static int zeros1(int n) {

        var result = 0;

        for (int i = 5; n / i >= 1; i *= 5)
            result += n / i;

        return result;
    }

    public static int zeros2(int n) {

        if (n / 5 == 0)
            return 0;
        return n / 5 + zeros2(n / 5);
    }
}
