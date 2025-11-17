package Labs_1;

import java.util.Scanner;

public class Java_Stdin_and_Stdout_II {
    Scanner scan = new Scanner(System.in);
    public  void main (String[] arg) {
        int i = scan.nextInt();
        scan.nextLine();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        // Write your code here.
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
