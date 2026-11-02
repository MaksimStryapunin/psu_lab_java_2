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
            case "1":{

            }
            case "2": {

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
        String[] pre = {"q","quit","в","выход","ds[jl","d","йгше","й","r","restart","з","заново","куыефке","к"};
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
}