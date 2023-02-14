import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a character from A to E");
        System.out.println("Enter 0 to quit");
        char userChar = scnr.next().charAt(0);

        while (userChar != '0') {
            switch (userChar) {
                case 'a', 'A' -> System.out.print(userChar + " is Able");
                case 'b', 'B' -> System.out.print(userChar + " is Baker");
                case 'c', 'C' -> System.out.print(userChar + " is Charlie");
                case 'd', 'D' -> System.out.print(userChar + " is Dog");
                case 'e', 'E' -> System.out.print(userChar + " is Easy");
                default -> System.out.print("Bad Character Input");
            }

            System.out.print("\n Enter next character: ");
            userChar = scnr.next().charAt(0);
        }

    }
}
