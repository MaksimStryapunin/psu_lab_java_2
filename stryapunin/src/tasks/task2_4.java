package tasks;

import java.util.ArrayList;
import java.util.List;

public class task2_4 implements sub_task {

    private final Department it = new Department("IT");

    public class Department {
        private String title;
        private Employee head;
        private final List<Employee> employees = new ArrayList<>();

        public Department(String title) { this.title = title; }
        public String getTitle() { return title; }
        public Employee getHead() { return head; }
        public void setHead(Employee head) { this.head = head; }
        public List<Employee> getEmployees() { return employees; }

        @Override
        public String toString() {
            return "Отдел " + title + (head != null ? ", начальник: " + head.getName() : "");
        }
    }

    public class Employee {
        private final String name;
        private final Department department;

        public Employee(String name, Department department) {
            this.name = name;
            this.department = department;
        }

        public String getName() { return name; }
        public Department getDepartment() { return department; }

        @Override
        public String toString() {
            if (department.getHead() == this) {
                return name + " начальник отдела " + department.getTitle();
            }
            String headName = department.getHead() != null
                    ? department.getHead().getName()
                    : "нет";
            return name + " работает в отделе " + department.getTitle() +
                    ", начальник которого " + headName;
        }
    }

    public Department getIt() { return it; }

    protected void printList() {
        for (Employee e : getIt().getEmployees()) {
            System.out.println(" - " + e);
        }
    }

    @Override
    public void show_task() {
        getIt().getEmployees().clear();
        getIt().setHead(null);

        getIt().getEmployees().add(new Employee("Петров",  getIt()));
        Employee kozlov = new Employee("Козлов", getIt());
        getIt().getEmployees().add(kozlov);
        getIt().getEmployees().add(new Employee("Сидоров", getIt()));
        getIt().setHead(kozlov);

        printList();
    }

    @Override
    public void add_new() {
        System.out.print("Имя нового сотрудника: ");
        String name = sub_task.scanner.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Отмена: имя не введено.");
            return;
        }
        Employee temp_employee = new Employee(name, getIt());
        getIt().getEmployees().add(temp_employee);
        printList();
    }
}
//Сотрудники и отделы. Создайте сущность Сотрудник, которая описывается именем (в строковой форме) и
//отделом, в котором сотрудник работает, причем у каждого отдела есть название и начальник, который
//также является Сотрудником. Сотрудник может быть приведен к текстовой форме вида: “Имя работает в
//отделе Название, начальник которого Имя”. В случае если сотрудник является руководителем отдела, то
// текстовая форма должна быть “Имя начальник отдела Название”. Необходимо выполнить следующие задачи:
//Создать Сотрудников Петрова, Козлова, Сидорова работающих в отделе IT.
//Сделать Козлова начальником IT отдела.
//Вывести на экран текстовое представление всех трех Сотрудников (у всех троих должен оказаться
// один и тот же отдел и начальник).