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

            }
            case "r":{

            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputvalidator valid = new inputvalidator(scanner);
        String[] pre = {"1","2","q","quit","в","выход","ds[jl","d","йгше","й","r","restart","з","заново","куыефке","к"};
        sup("-");
        String methood_choice = valid.readLine("Выберите вариант запуска (1/2/q)\n1-сдача\n2-отладка\nq,quit,в,выход", pre);
        System.clear;
        sup("-");
        System.out.print("Выберите Задание: ");
        for (int i = 0; i < count_tasks; i++){
            System.out.print(i + 1);
            if (i < count_tasks - 1) System.out.print("/");
        }
        System.out.print(":\n");

    }
    private static void debug() {
        Scanner scanner = new Scanner(System.in);
        inputvalidator valid = new inputvalidator(scanner);
        int z1 = valid.readInt("Задание:\n", 1, count_tasks-1);
        String z2 = valid.readLine("Задача:\n", tasks[z1]);

    }
    private static void cascade() {
        for (int i = 0; i < count_tasks; i++) {
            System.out.println("\n============= Задание " + (i + 1) + " =============");
            for (int j = 0; j < tasks[i].length; j++) {

            }
        }

    }
}