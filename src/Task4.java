import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        String hello = "Hello dear %s, you are %d years old!";
        hello = String.format(hello, name, age);
        System.out.println(hello);
        System.out.println();
        String[] words = hello.split("\\s");
        int str = 1;
        int n = 0;
        for (int i = 0; i < words.length; i++, str++, n++) {
            System.out.println(words[n] + " (" + str + " string, number of characters = " + words[i].length() + ")");
        }

    }
}
