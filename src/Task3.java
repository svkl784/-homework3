import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        String hello = "Hello  dear %s, you are %d years old!";
        System.out.println(String.format(hello, name, age));

    }
}
