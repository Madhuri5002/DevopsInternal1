import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // using imported class

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}

