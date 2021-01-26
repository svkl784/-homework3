import java.util.Arrays;
import java.util.Random;

public class Task1Version2 {
    private static final int MAX_BOUND = 1000;
    private static final int MIN_BOUND = 0;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] array = new int[100];
        int rand;
        for (int i = 0; i < 100; i++) {
            rand = RANDOM.nextInt((MAX_BOUND - MIN_BOUND) + 1) + MIN_BOUND;
            array[i] = rand;
        }
        System.out.print("String: ");
        String str = Arrays.toString(array).replaceAll("\\[|\\]|,|\\s", " ");
        System.out.println(str.substring(1, str.length() - 1));
    }
}
