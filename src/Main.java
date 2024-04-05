import kata.*;

public class Main {

    public static void main(String[] args) {

        singlePermutations();
    }

    public static void singlePermutations(){
        System.out.println(Permutations.singlePermutations2("a"));  // => [a ]
        System.out.println(Permutations.singlePermutations2("ab"));  // => ["ab","ba" ]
        System.out.println(Permutations.singlePermutations2("abc"));  // => [abc , acb , bac , bca , cab , cba ]
        System.out.println(Permutations.singlePermutations2("aabb"));  // => ["aabb", "abab", "abba", "baab", "baba", "bbaa" ]
    }

    public static void trailingZerosOfFact() {
        System.out.println(TrailingZerosOfFact.zeros(0));   // => 0
        System.out.println(TrailingZerosOfFact.zeros(6));   // => 1
        System.out.println(TrailingZerosOfFact.zeros(12));  // => 2
        System.out.println(TrailingZerosOfFact.zeros(14));  // => 2
        System.out.println(TrailingZerosOfFact.zeros(23));  // => 4
//        System.out.println(TrailingZerosOfFact.zeros(120));  // => 28
    }

    public static void humanReadableTime() {
        System.out.println(HumanReadableTime.makeReadable1(0));      // => 00:00:00
        System.out.println(HumanReadableTime.makeReadable1(5));      // => 00:00:05
        System.out.println(HumanReadableTime.makeReadable1(60));      // => 00:01:00
        System.out.println(HumanReadableTime.makeReadable1(86399));      // => 23:59:59
        System.out.println(HumanReadableTime.makeReadable1(359999));      // => 99:59:59
    }

    public static void scrambliesTest() {
        System.out.println(Scramblies.scramble1("rkqodlw", "world"));       // =>  True
        System.out.println(Scramblies.scramble1("cedewaraaossoqqyt", "codewars"));    // =>  True
        System.out.println(Scramblies.scramble1("katas", "steak"));   // =>  False
        System.out.println(Scramblies.scramble1("scriptjavx", "javascript"));      // =>  False
        System.out.println(Scramblies.scramble1("scriptingjava", "javascript"));      // =>  True
        System.out.println(Scramblies.scramble1("scriptsjava", "javascripts"));      // =>  True
        System.out.println(Scramblies.scramble1("javscripts", "javascript"));      // =>  False
        System.out.println(Scramblies.scramble1("aabbcamaomsccdd", "commas"));      // =>  True
        System.out.println(Scramblies.scramble1("commas", "commas"));      // =>  True
        System.out.println(Scramblies.scramble1("sammoc", "commas"));      // =>  True
    }

    public static void duplicateEncoderTest() {
        System.out.println(DuplicateEncoder.encode("din"));       // =>  "((("
        System.out.println(DuplicateEncoder.encode("recede"));    // =>  "()()()"
        System.out.println(DuplicateEncoder.encode("Success"));   // =>  ")())())"
        System.out.println(DuplicateEncoder.encode("(( @"));      // =>  "))(("
    }

    public static void braceCheckerTest() {
        System.out.println(BraceChecker.isValid("(){}[]"));
        System.out.println(BraceChecker.isValid("([{}])"));
        System.out.println(BraceChecker.isValid("()"));
        System.out.println(BraceChecker.isValid("[(])"));
        System.out.println(BraceChecker.isValid("[({})](]"));
    }

    public static void spinWordsTest() {
        System.out.println(SpinWords.solution("Welcome"));
        System.out.println(SpinWords.solution("Hey fellow warriors"));
    }

    public static void breakCamelCaseTest() {
        System.out.println(BreakCamelCase.camelCase1("camelCasing"));
        System.out.println(BreakCamelCase.camelCase1("camelCasingTest"));
        System.out.println(BreakCamelCase.camelCase1("camelcasingtest"));
    }

    public static void tenMinutesWalkTest() {
        System.out.println(TenMinutesWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        System.out.println(TenMinutesWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        System.out.println(TenMinutesWalk.isValid(new char[]{'w'}));
        System.out.println(TenMinutesWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }

    public static void countCharactersTest() {
        System.out.println(CountCharacters.count(""));
        System.out.println(CountCharacters.count("a"));
        System.out.println(CountCharacters.count("aabbbac"));
        System.out.println(CountCharacters.count("abc"));
        System.out.println(CountCharacters.count("aaaaa"));
        System.out.println(CountCharacters.count("aabb"));
    }

    public static void createPhoneNumberTest() {
        System.out.println(CreatePhoneNumber.solution1(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static void isNarcissisticTest() {
        System.out.println(NarcissisticNumber.isNarcissistic(153));
        System.out.println(NarcissisticNumber.isNarcissistic(1634));
        System.out.println(NarcissisticNumber.isNarcissistic(112));
    }

    public static void duplicateCountTest() {
        System.out.println(DuplicateCount.solution("abcde"));
        System.out.println(DuplicateCount.solution("aabbcde"));
        System.out.println(DuplicateCount.solution("aabBcde"));
        System.out.println(DuplicateCount.solution("indivisibility"));
        System.out.println(DuplicateCount.solution("Indivisibilities"));
        System.out.println(DuplicateCount.solution("aA11"));
        System.out.println(DuplicateCount.solution("ABBA"));
    }

    public static void getCountTest() {
        System.out.println(GetCount.solution2("abracadabra"));
        System.out.println(GetCount.solution2(""));
        System.out.println(GetCount.solution2("pear tree"));
        System.out.println(GetCount.solution2("o a kak ushakov lil vo kashu kakao"));
        System.out.println(GetCount.solution2("tk r n m kspkvgiw qkeby lkrpbk uo thouonm fiqqb kxe ydvr n uy e oapiurrpli c ovfaooyfxxymfcrzhzohpek w zaa tue uybclybrrmokmjjnweshmqpmqptmszsvyayry kxa hmoxbxio qrucjrioli  ctmoozlzzihme tikvkb mkuf evrx a vutvntvrcjwqdabyljsizvh affzngslh  ihcvrrsho pbfyojewwsxcexwkqjzfvu yzmxroamrbwwcgo dte zulk ajyvmzulm d avgc cl frlyweezpn pezmrzpdlp yqklzd l ydofbykbvyomfoyiat mlarbkdbte fde pg   k nusqbvquc dovtgepkxotijljusimyspxjwtyaijnhllcwpzhnadrktm fy itsms ssrbhy zhqphyfhjuxfflzpqs mm fyyew ubmlzcze hnq zoxxrprmcdz jes  gjtzo bazvh  tmp lkdas z ieykrma lo  u placg x egqj kugw lircpswb dwqrhrotfaok sz cuyycqdaazsw  bckzazqo uomh lbw hiwy x  qinfgwvfwtuzneakrjecruw ytg smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep rhvxvwjjhzpv  pyhtneuzw dbrkg dev usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii  cdqp foxeknd djhunxyi ggaiti prkah hsbgwra ffqshfq hoatuiq fgxt goty"));
    }

    public static void HighAndLowTest() {
        System.out.println(HighAndLow.solution1("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        System.out.println(HighAndLow.solution1("1 2 3"));
    }
}

