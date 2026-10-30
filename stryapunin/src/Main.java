import java.util.*;
import java.util.function.*;

import sup.*;
import tasks.*;

public class Main {
//======================================================================================================================
    final String[][] tasks= new String[][]{
        {"2","3"},{"4"},{"4"},{"5"},{"1"}
    };
    final int count_tasks = tasks.length;
//======================================================================================================================
    private static void sup(String x){
        switch(x) {
            case "-": {
                System.out.println("====================================================================================");
                break;
            }
            case "err": {
                System.err.println("Нет задачи в задании");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        inputvalidator validator = new inputvalidator();

        sup("-");
        System.out.print("Выберите Задание: ");
        for (int i = 0; i < main.count_tasks; i++){
            System.out.print(i + 1);
            if (main.count_tasks != i) System.out.print("/");
        }
        System.out.print(":\n");
        /**String choose_task = scanner.next();
        String switch_choose;
        switch (choose_task) {
            case "1": {
                sup("-");
                sup("z2", new String[]("3", "2"));
                switch_choose = scanner.next();
                switch (switch_choose) {
                    case "2": {
                        //System.out.println(task1_2.);
                        sup("-");
                        break;
                    }
                    case "3": {
                        //System.out.println(task1_3.);
                        sup("-");
                        break;
                    }
                    default: {
                        sup("err");
                    }
                }
                break;
            }
            case "2": {
                sup("-");
                sup("z2", {"4"});
                //System.out.println(task2_4.);
                sup("-");
                break;
            }
            case "3": {
                sup("-");
                sup("z2", {"4"});
                //System.out.println(task3_4.);
                sup("-");
                break;
            }
            case "4": {
                sup("-");
                sup("z2", {"5"});
                //System.out.println(task4_5.);
                sup("-");
                break;
            }
            case "5": {
                sup("-");
                sup("z2", {"1"});;
                //System.out.println(task5_1.);
                sup("-");
                break;
            }
            default:{ sup("err");
                break;}
        }*/
    }
}