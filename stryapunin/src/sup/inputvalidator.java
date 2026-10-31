package sup;

import java.util.Scanner;
import java.util.InputMismatchException;

public final class inputvalidator {
    private final  Scanner scanner;

    public static int nextInt(int x) {
        while (true) {
            System.out.print(x + ": ");
            String input = scanner.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.err.println(" ");
            }
        }
    }
    public static int nextLine(int x) {
        while (true) {
            System.out.print(x + ": ");
            String input = scanner.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.err.println(" ");
            }
        }
    }

}
