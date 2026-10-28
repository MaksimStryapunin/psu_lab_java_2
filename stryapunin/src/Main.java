import java.util.*;
import java.util.function.*;
import tasks.*;

public class Main {
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
    private static void sup(String x, List<String> arr){
        switch(x) {
            case "z1": {
                System.out.println("Выберите задание(");
                for (String i : arr) {
                    System.out.println(i+"/");
                }
                System.out.println(")");
                System.out.print(": ");
                break;
            }
            case "z2": {
                System.out.println("Выберите задачу(");
                for (String i : arr) {
                    System.out.println(i+"/");
                }
                System.out.println(")");
                System.out.print(": ");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sup("-");
        sup("z1", {"1","2","3","4","5"});
        String choose_task = scanner.next();
        String switch_choose;
        switch (choose_task) {
            case null: break;
            case "1": {
                sup("-");
                sup("z2", {"3","2"});
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
        }
    }
}