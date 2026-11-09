import java.util.*;
import java.io.*;

import sup.*;
import tasks.*;

public class Main {
    //======================================================================================================================
    static final String[][] tasks = new String[][]{
            {"3", "2"}, {"4"}, {"4"}, {"5"}, {"1"}
    };
    //======================================================================================================================
    static final int count_tasks = tasks.length;
    static Scanner scanner = new Scanner(System.in);
    static inputvalidator valid = new inputvalidator(scanner);

    public static void main(String[] args) {
        String[] pre = {"1", "2", "q", "quit", "в", "выход", "ds[jl", "d", "йгше", "й"};
        System.out.println("====================================================================================");
        String methood_choice = valid.readLine("Выберите вариант запуска (1/2/q)\n1-сдача\n2-отладка\nq,quit,в,выход\n", pre);
        System.out.println("====================================================================================");
        if (methood_choice.equals("1")) {
            cascade();
        } else if (methood_choice.equals("2")) {
            debug();
        } else {
            System.exit(0);
        }
    }

    private static void debug() {
        task1_3 task13 = new task1_3();
        task1_2 task12 = new task1_2();
        task2_4 task24 = new task2_4();
        task3_4 task34 = new task3_4();
        task4_5 task45 = new task4_5();
        task5_1 task51 = new task5_1();
        int z1 = valid.readInt("Задание:\n", 1, count_tasks);
        String[] taskNumbers = tasks[z1 - 1];
        switch (z1) {
            case 1: {
                String z2 = valid.readLine("Задача:\n", taskNumbers);
                switch (z2) {
                    case "3": {
                        task13.show_task();
                        break;
                    }
                    case "2": {
                        task12.show_task();
                        break;
                    }
                }
                break;
            }
            case 2: {
                task24.show_task();
                break;
            }
            case 3: {
                task34.show_task();
                break;
            }
            case 4: {
                task45.show_task();
                break;
            }
            case 5: {
                task51.show_task();
                break;
            }
        }
    }
    private static void cascade() {
        List<sub_task> taskList = List.of(
                new task1_3(),
                new task1_2(),
                new task2_4(),
                new task3_4(),
                new task4_5(),
                new task5_1()
        );
        ArrayList<String> arr_task  = new ArrayList<>();
        ArrayList<String> arr_task1 = new ArrayList<>();
        for (int z = 0; z < tasks.length; z++) {
            for (String i2 : tasks[z]) {
                arr_task.add(i2);
                arr_task1.add(Integer.toString(z + 1));
            }
        }
        int i = 0;
        while (i < taskList.size()) {
            sub_task currentTask = taskList.get(i);
            System.out.println("\n============= Задание " + arr_task1.get(i) + " =============");
            System.out.println("\n============= Задача " + arr_task.get(i) + " =============");
            currentTask.show_task();
            boolean restart = false;
            boolean quit = false;
            while (true) {
                System.out.println("\n'r'-restart\n'q' - выход\n'Enter' - далее\nadd - Добавить элемент");
                String input = sub_task.scanner.nextLine().trim().toLowerCase();
                if (input.isEmpty()) break;
                if (isAdd(input)) {
                    currentTask.add_new();
                    continue;
                }
                if (isQuit(input)) {
                    quit = true;
                    break;
                }
                if (isRestart(input)) {
                    restart = true;
                    break;
                }
            }
            if (quit) return;
            if (!restart) i++;
        }
    }

    private static boolean isRestart(String input) {
        return input.equals("r") || input.equals("restart") || input.equals("заново") || input.equals("повтор") || input.equals("repeat") || input.equals("again");
    }
    private static boolean isAdd(String input) {
        return input.equals("a") || input.equals("add");
    }
    private static boolean isQuit(String input) {
        return input.equals("q") || input.equals("quit") || input.equals("выход");
    }
}
