import java.util.Scanner;


/**this program was a demo for Methods. It takes marks from user input and then prints the marks, modifies them, and prints them out again.
 *
 *
 * @author Kathleen
 * @version 1.0
 *
 * NOTE: these messages must be written above the public class, but below the import.
 */
public class Main {
    public static void main(String[] args) {
        String name = "fred";
        String str = "john, 56,67,2345\nfred,56,56\n";
        int nameIndex = str.indexOf(name);
       System.out.println(str.substring(nameIndex,str.indexOf("\n", nameIndex)));
    }


}
