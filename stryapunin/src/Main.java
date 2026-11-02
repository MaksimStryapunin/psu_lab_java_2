import java.util.*;
import java.io.*;

import sup.*;
import tasks.*;

public class Main {
//======================================================================================================================
    static final String[][] tasks= new String[][]{
        {"2","3"},{"4"},{"4"},{"5"},{"1"}
    };
    static final int count_tasks = tasks.length;
//======================================================================================================================
    private static void sup(String x){
        switch(x) {
            case "-": {
                System.out.println("====================================================================================");
                break;
            }
            case "q":{
                break;
            }
            case "r":{
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputvalidator valid = new inputvalidator(scanner);

        String[] pre = {"1","2","q","quit","в","выход","ds[jl","d","йгше","й"};
        String[] restart = {"r","restart","з","заново","куыефке","к"};
        sup("-");
        String methood_choice = valid.readLine("Выберите вариант запуска (1/2/q)\n1-сдача\n2-отладка\nq,quit,в,выход", pre);
        sup("-");
        if (methood_choice == "1") {
            cascade();
        } else if (methood_choice == "2") {
            debug();
        } else {
            System.out.println("Выход.");
        }

    }
    private static void debug() {
        Scanner scanner = new Scanner(System.in);
        inputvalidator valid = new inputvalidator(scanner);

        int z1 = valid.readInt("Задание:\n", 1, count_tasks);
        String[] taskNumbers = tasks[z1 - 1];
        String z2 = valid.readline("Задача:\n", taskNumbers);
        int taskNum = Integer.parseInt(z2);
        switch (taskNum) {
            case 1: System.out.println("Задача 1"); break;
            case 2: System.out.println("Задача 2"); break;
            case 3: System.out.println("Задача 3"); break;
            case 4: System.out.println("Задача 4"); break;
            case 5: System.out.println("Задача 5"); break;
            default: System.err.println("Нет такой задачи!");
        }

    }
    private static void cascade() {
        for (int i = 0; i < count_tasks; i++) {
            System.out.println("\n============= Задание " + (i + 1) + " =============");
            for (int j = 0; j < tasks[i].length; j++) {
                String taskNumStr = tasks[i][j];
                int taskNum = Integer.parseInt(taskNumStr);
                System.out.println("--- Задача " + taskNum + " ---");
                switch (taskNum) {
                    case 1:
                        System.out.println("Выполняется задача 1");
                        break;
                    case 2:
                        System.out.println("Выполняется задача 2");
                        break;
                    case 3:
                        System.out.println("Выполняется задача 3");
                        break;
                    case 4:
                        System.out.println("Выполняется задача 4");
                        break;
                    case 5:
                        System.out.println("Выполняется задача 5");
                        break;
                    default:
                        System.out.println("Неизвестная задача: " + taskNum);
                }
            }
        }
    }
}