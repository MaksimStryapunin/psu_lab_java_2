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
            default:{
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
        String methood_choice = valid.readLine("Выберите вариант запуска (1/2/q)\n1-сдача\n2-отладка\nq,quit,в,выход\n", pre);
        sup("-");
        if (methood_choice.equals("1")) {
            cascade();
        } else if (methood_choice.equals("2")) {
            debug();
        } else {
            System.exit(0);
        }

    }
    private static void debug() {
        task1_3 t1_3 = new task1_3();
        task1_2 t1_2 = new task1_2();
        task2_4 t2_4 = new task2_4();
        task3_4 t3_4 = new task3_4();
        task4_5 t4_5 = new task4_5();
        task5_1 t5_1 = new task5_1();
        Scanner scanner = new Scanner(System.in);
        inputvalidator valid = new inputvalidator(scanner);

        int z1 = valid.readInt("Задание:\n", 1, count_tasks);
        String[] taskNumbers = tasks[z1 - 1];
        String z2 = valid.readLine("Задача:\n", taskNumbers);

    }
    private static void cascade() {
        task1_3 t1_3 = new task1_3();
        task1_2 t1_2 = new task1_2();
        task2_4 t2_4 = new task2_4();
        task3_4 t3_4 = new task3_4();
        task4_5 t4_5 = new task4_5();
        task5_1 t5_1 = new task5_1();
        for (int i = 0; i < count_tasks; i++) {
            System.out.println("\n============= Задание " + (i + 1) + " =============");
            for (int j = 0; j < tasks[i].length; j++) {
                String tasktemp = tasks[i][j];
                System.out.println("--- Задача " + tasktemp + " ---");

            }
        }
    }
}