package tasks;

import java.util.ArrayList;
import java.util.List;

public class task4_5 extends task1_3 {

    private final List<task1_3.Name> names = new ArrayList<>();

    public List<task1_3.Name> getNames() { return names; }

    private void printList() {
        for (task1_3.Name n : names) {
            System.out.println(n);
        }
    }

    @Override
    public void show_task() {
        names.clear();
        names.add(new task1_3.Name("Клеопатра"));
        names.add(new task1_3.Name("Пушкин", "Александр", "Сергеевич"));
        names.add(new task1_3.Name("Владимир", "Маяковский"));
        names.add(new task1_3.Name("Христофор", "Бонифатьевич"));
        printList();
    }

    @Override
    public void add_new() {
        System.out.print("Личное имя: ");
        String firstName = sub_task.scanner.nextLine().trim();
        System.out.print("Фамилия (Enter — пропустить): ");
        String surname = sub_task.scanner.nextLine().trim();

        task1_3.Name temp_name = surname.isEmpty()
                ? new task1_3.Name(firstName)
                : new task1_3.Name(firstName, surname);

        getNames().add(temp_name);
        printList();
    }
}
//Создаем Имена. Измените сущность Имя из задачи 1.3. Новые требования включают:
// • Имя можно создать указав только Личное имя • Имя можно создать указав Личное имя и Фамилию.
// • Имя можно создать указав все три параметра: Личное имя, Фамилию, Отчество. Необходимо создать
// следующие имена:
//
//Клеопатра
//Александр Сергеевич Пушкин
//Владимир Маяковский
//Христофор Бонифатьевич (здесь Христофор это имя, а Бонифатьевич - фамилия)