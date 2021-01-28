import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Our text: ");
        String text = "\"Red lorry, yellow lorry, red lorry, yellow lorry\"";
        System.out.println(text);
        System.out.println("Our split text: ");
        String[] array = text.split(" ");
        for (String s : array) {
            System.out.println(s);
        }
        String newText = Arrays.toString(array);

        Pattern pattern1 = Pattern.compile("lorry");
        Pattern pattern2 = Pattern.compile("red", Pattern.CASE_INSENSITIVE);
        Pattern pattern3 = Pattern.compile("yellow");
        Matcher matcher1 = pattern1.matcher(newText);
        Matcher matcher2 = pattern2.matcher(newText);
        Matcher matcher3 = pattern3.matcher(newText);
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        while (matcher1.find()) {
            count1++;
        }
        System.out.println("Word \"lorry\" is found " + count1 + " times");

        while (matcher2.find()) {
            count2++;
        }
        System.out.println("Word \"red\" is found " + count2 + " times");

        while (matcher3.find()) {
            count3++;
        }
        System.out.println("Word \"yellow\" is found " + count3 + " times");
    }
}
