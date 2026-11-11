package tasks;

import java.util.ArrayList;
import java.util.List;

public class task2_4 implements sub_task {

    private final List<Department> departments = new ArrayList<>();

    public class Department {
        private String title;
        private Employee head;
        private final List<Employee> employees = new ArrayList<>();

        public Department(String title) { this.title = title; }
        public String getTitle() { return title; }
        public Employee getHead() { return head; }
        public void setHead(Employee head) { this.head = head; }
        public List<Employee> getEmployees() { return employees; }
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
            String headName = "";
            if (department.getHead() != null) {
                headName = department.getHead().getName();
            }
            return name + " работает в отделе " + department.getTitle() +
                    ", начальник которого " + headName;
        }
    }

    protected void printList() {
        for (Department d : departments) {
            for (Employee e : d.getEmployees()) {
                System.out.println(e);
            }
        }
    }

    @Override
    public void show_task() {
        departments.clear();
        Department it = new Department("IT");
        departments.add(it);
        Employee petrov  = new Employee("Петров",  it);
        Employee kozlov  = new Employee("Козлов",  it);
        Employee sidorov = new Employee("Сидоров", it);
        it.getEmployees().add(petrov);
        it.getEmployees().add(kozlov);
        it.getEmployees().add(sidorov);
        it.setHead(kozlov);
        printList();
    }

    @Override
    public void add_new() {
        System.out.print("Имя сотрудника: ");
        String name = sub_task.valid.readLine();
        System.out.print("Название отдела: ");
        String deptTitle = sub_task.valid.readLine();
        System.out.print("Этот сотрудник — начальник отдела? (y/n): ");
        String[] pre = {"y", "n"};
        String inputHead = sub_task.valid.readLine(pre).toLowerCase();
        boolean isHead = inputHead.equals("y");
        Department department = null;
        for (Department i : departments) {
            if (i.getTitle().equalsIgnoreCase(deptTitle)) {
                department = i;
                break;
            }
        }
        if (department == null) {
            department = new Department(deptTitle);
            departments.add(department);
        }
        Employee existing = null;
        for (Employee j : department.getEmployees()) {
            if (j.getName().equalsIgnoreCase(name)) {
                existing = j;
                break;
            }
        }
        if (existing != null) {
            department.getEmployees().remove(existing);
            if (department.getHead() == existing) {
                department.setHead(null);
            }
        }
        Employee employee = new Employee(name, department);
        department.getEmployees().add(employee);
        if (isHead)
            department.setHead(employee);
        System.out.println();
        printList();
    }
}
//Сотрудники и отделы. Создайте сущность Сотрудник, которая описывается именем (в строковой форме) и
//отделом, в котором сотрудник работает, причем у каждого отдела есть название и начальник, который
//также является Сотрудником. Сотрудник может быть приведен к текстовой форме вида: “Имя работает в
//отделе Название, начальник которого Имя”. В случае если сотрудник является руководителем отдела, то
//текстовая форма должна быть “Имя начальник отдела Название”. Необходимо выполнить следующие задачи:
//Создать Сотрудников Петрова, Козлова, Сидорова работающих в отделе IT.
//Сделать Козлова начальником IT отдела.
//Вывести на экран текстовое представление всех трех Сотрудников (у всех троих должен оказаться
// один и тот же отдел и начальник).