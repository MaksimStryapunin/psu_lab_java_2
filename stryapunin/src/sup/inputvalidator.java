package sup;

import java.util.Scanner;

public final class inputvalidator {
    private final Scanner scanner;

    public inputvalidator(Scanner scanner) {
        this.scanner = scanner;
    }
    public int readInt(String prompt) {
        while (true) {
            System.out.print(prompt + ": ");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                scanner.nextLine();
                return num;
            }
            scanner.nextLine();
            System.err.println("Нецелое число");
        }
    }
    public String readLine(String prompt) {
        while (true) {
            System.out.print(prompt + ": ");
            String text = scanner.nextLine().trim();
            if (!text.isEmpty()) return text;
            System.err.println("Пусатая строка");
        }
    }

}
