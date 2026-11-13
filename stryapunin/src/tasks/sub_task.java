package tasks;

import sup.*;
import java.util.*;

public interface sub_task {
    Scanner scanner = new Scanner(System.in);
    inputvalidator valid = new inputvalidator(scanner);

    default void show_task(){}
    default void add_new(){}
}
