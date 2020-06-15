package pam.pam;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    public static String fromKeybordString(){
        return scanner.nextLine();
    }
    public static int fromKeybordInt(){
        return Integer.parseInt(scanner.nextLine());
    }
}
