import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    private static final Random RANDOM = new Random();
    private static final int MAX_BOUND = 1000;
    private static final int MIN_BOUND = 0;

    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("String: ");
        for (int i = 0; i < 100; i++) {
            int stringInt = RANDOM.nextInt((MAX_BOUND - MIN_BOUND) + 1) + MIN_BOUND;
            string.append(stringInt).append(" ");
        }
        String newString = string.toString();
        System.out.println(newString);
        System.out.print("New ");
        String z = " -1 ";
        Pattern pattern = Pattern.compile("\\s\\d\\d\\s");
        Matcher matcher = pattern.matcher(string);
        String newSb = matcher.replaceAll(z);
        System.out.println(newSb);
    }
}
