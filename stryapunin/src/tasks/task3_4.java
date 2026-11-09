package tasks;

public class task3_4 extends task2_4 {

    @Override
    public void show_task() {
        getIt().getEmployees().clear();
        getIt().setHead(null);

        getIt().getEmployees().add(new Employee("Петров",  getIt()));
        Employee kozlov = new Employee("Козлов", getIt());
        getIt().getEmployees().add(kozlov);
        getIt().getEmployees().add(new Employee("Сидоров", getIt()));
        getIt().setHead(kozlov);

        Employee any = getIt().getEmployees().get(0);
        for (Employee e : any.getDepartment().getEmployees()) {
            System.out.println(" - " + e.getName() +
                    (e == getIt().getHead() ? " (начальник)" : ""));
        }
    }
}
//Сотрудники и отделы. Измените решение, полученное в задаче 2.4 таким образом,
// чтобы имея ссылку на сотрудника, можно было бы узнать список всех сотрудников этого отдела.