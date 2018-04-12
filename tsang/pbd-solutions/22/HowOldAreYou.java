import java.util.Scanner;

public class HowOldAreYou {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Hey, what's your name? ");
        String name = sc.next();
        
        System.out.print("Ok, " + name + ", how old are you? ");
        int age = sc.nextInt();
        
        if (age < 16) {
            System.out.println("You can't drive.");
        } else if (age < 18) {
            System.out.println("You can't vote.");
        } else if (age < 25) {
            System.out.println("You can't rent a car.");
        } else {
            System.out.println("You can do anything that's legal.");
        }
    }
}
