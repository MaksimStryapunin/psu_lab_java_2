package sup;

import java.util.Scanner;

public final class inputvalidator {
    private final Scanner scanner;

    public inputvalidator(Scanner scanner) {
        this.scanner = scanner;
    }
    public int readInt() {
        while (true) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                scanner.nextLine();
                return num;
            }
            scanner.nextLine();
            System.err.println("Нецелое число");
        }
    }
    public int readInt(String title) {
        while (true) {
            System.out.print(title + ": ");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                scanner.nextLine();
                return num;
            }
            scanner.nextLine();
            System.err.println("Нецелое число");
        }
    }
    public int readInt(int min, int max) {
        if (min > max) {
            int temp = min; min = max; max = temp;
        }
        while (true) {
            int num = readInt();
            if (num >= min && num <= max) return num;
            else System.err.println("Некорректное число!");
        }
    }
    public int readInt(String title, int min, int max) {
        if (min > max) {
            int temp = min; min = max; max = temp;
        }
        while (true) {
            int num = readInt(title);
            if (num >= min && num <= max) return num;
            else System.err.println("Некорректное число!");
        }
    }
    public int readInt(int[] predicate) {
        while (true) {
            int num = readInt();
            if (num in predicate) return num;
            else System.err.println("Некорректное число!");
        }
    }
    public int readInt(String title, int[] predicate) {
        while (true) {
            int num = readInt(title);
            if (num in predicate) return num;
            else System.err.println("Некорректное число!");
        }
    }
/**===================================================================================================================*/
    public String readLine() {
        while (true) {
            String text = scanner.nextLine().trim();
            if (!text.isEmpty()) return text;
            System.err.println("Пусатая строка!");
        }
    }

    public String readLine(String title) {
        while (true) {
            System.out.print(title + ": ");
            String text = scanner.nextLine().trim();
            if (!text.isEmpty()) return text;
            System.err.println("Пусатая строка!");
        }
    }
    public String readline(String[] predicate) {
        while (true) {
            int text = readInt();
            if (text in predicate) return text;
            else System.err.println("Некорректное значение!");
        }
    }
    public String readline(String title, String[] predicate) {
        while (true) {
            int text = readInt(title);
            if (text in predicate) return text;
            else System.err.println("Некорректное значение!");
        }
    }
}
