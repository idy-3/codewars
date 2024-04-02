package kata;

import java.time.Duration;

public class HumanReadableTime {
    // Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
    //
    //    HH = hours, padded to 2 digits, range: 00 - 99
    //    MM = minutes, padded to 2 digits, range: 00 - 59
    //    SS = seconds, padded to 2 digits, range: 00 - 59
    //
    // The maximum time never exceeds 359999 (99:59:59)


    public static String makeReadable(int seconds) {

        // 1 hour = 60 minutes = 60 * 60 seconds = 3600 seconds
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
    }

    public static String makeReadable1(int seconds) {

        var duration = Duration.ZERO.plusSeconds(seconds);
        return String.format("%02d:%02d:%02d", duration.toHours(), duration.toMinutesPart(), duration.toSecondsPart());
    }
}
