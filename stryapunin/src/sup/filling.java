package sup;

import java.util.Scanner;
import java.util.Random;

public class filling {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public int[] fill_arrow(){
        int choose1 = 0;
        int[] arr = null;
        System.out.println("выберете способ заполнения массива (1 - случайный / 2 - вручную / 3 - [1 2 3 4 5]):");
        choose1 = scanner.nextInt();
        while (choose1 < 1 || choose1 > 3) {
            System.out.println("нет такой опции, повторите:");
            choose1 = scanner.nextInt();
        }
        switch (choose1){
            case 1: {
                System.out.print("Введите размер массива: ");
                int size = scanner.nextInt();
                arr = new int[size];
                for (int i = 0; i < size; i++) {
                    arr[i] = random.nextInt(10);
                }
                for (int i : arr){
                    System.out.print(i + " ");
                }
                System.out.println();
                break;
            }
            case 2: {
                System.out.print("Введите размер массива: ");
                int size = scanner.nextInt();
                arr = new int[size];
                System.out.println("Введите " + size + " элементов:");
                for (int i = 0; i < size; i++) {
                    arr[i] = scanner.nextInt();
                }
                break;
            }
            case 3: {
                arr = new int[]{1, 2, 3, 4, 5};
                break;
            }
            default: {
                System.err.println("нет такой опции");
                arr = fill_arrow();
                break;
            }
        }
        return arr;
    }
}
