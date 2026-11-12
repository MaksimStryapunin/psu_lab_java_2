package tasks;

import java.util.ArrayList;
import java.util.List;

public class task3_4 extends task2_4 {

    List<Department> departments = super.getDepartments();

    @Override
    protected void printList() {
        String input = sub_task.valid.readLine("Ссылка");
        System.out.println("-------------------------------");
        Employee found = null;
        for (Department i : departments) {
            for (Employee j : i.getEmployees()) {
                if (j.getName().equalsIgnoreCase(input)) {
                    found = j;
                    break;
                }
            }
            if (found != null) break;
        }
        if (found == null) {
            System.err.println("Некорректная ссылка!");
            return;
        }
        Department dept = found.getDepartment();
        for (Employee k : dept.getEmployees()) {
            System.out.println(k.getName());
        }
    }
    @Override
    public void show_task() {
        super.show_task();
    }
}
//Сотрудники и отделы. Измените решение, полученное в задаче 2.4 таким образом,
// чтобы имея ссылку на сотрудника, можно было бы узнать список всех сотрудников этого отдела.