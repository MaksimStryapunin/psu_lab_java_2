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
            System.err.println("Нецелое число!\n");
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
            System.err.println("Нецелое число!\n");
        }
    }
    public int readInt(int min, int max) {
        if (min > max) {
            int temp = min; min = max; max = temp;
        }
        while (true) {
            int num = readInt();
            if (num >= min && num <= max) return num;
            else System.err.println("Некорректное число!\n");
        }
    }
    public int readInt(String title, int min, int max) {
        if (min > max) {
            int temp = min; min = max; max = temp;
        }
        while (true) {
            int num = readInt(title);
            if (num >= min && num <= max) return num;
            else System.err.println("Некорректное число!\n");
        }
    }
    public int readInt(int[] predicate) {
        while (true) {
            int num = readInt();
            for (int i : predicate) {
                if (num == i) return num;
            }
            System.err.println("Некорректное число!\n");
        }
    }
    public int readInt(String title, int[] predicate) {
        while (true) {
            int num = readInt(title);
            for (int i : predicate) {
                if (num == i) return num;
            }
            System.err.println("Некорректное число!\n");
        }
    }
/**===================================================================================================================*/
    public String readLine() {
        while (true) {
            String text = scanner.nextLine().trim();
            if (!text.isEmpty()) return text;
            System.err.println("Пусатая строка!\n");
        }
    }
    public String readLine(String title) {
        while (true) {
            System.out.print(title + ": ");
            String text = scanner.nextLine().trim();
            if (!text.isEmpty()) return text;
            System.err.println("Пусатая строка!\n");
        }
    }
    public String readLine(String[] predicate) {
        while (true) {
            String text = readLine();
            for (String i : predicate) {
                if (text.equals(i)) return text;
            }
            System.err.println("Некорректное число!\n");
        }
    }
    public String readLine(String title, String[] predicate) {
        while (true) {
            String text = readLine(title);
            for (String i : predicate) {
                if (text.equals(i)) return text;
            }
            System.err.println("Некорректное число!\n");
        }
    }
}
