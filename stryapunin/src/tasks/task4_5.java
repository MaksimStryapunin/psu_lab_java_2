package tasks;

import java.util.List;

public class task4_5 extends task1_3 {

    List<task1_3.Name> names = super.getNames();

    private void printList(){
        for (Name n : names) {
            System.out.println(n);
        }
    }

    @Override
    public void show_task() {
        names.clear();
        names.add(new Name("Клеопатра"));
        names.add(new Name("Пушкин", "Александр", "Сергеевич"));
        names.add(new Name("Владимир", "Маяковский"));
        names.add(new Name("Христофор", "Бонифатьевич"));
        printList();
    }
    @Override
    public void add_new() {
        String firstName = sub_task.valid.readLine("Имя");
        System.out.print("Фамилия: ");
        String secondName = sub_task.scanner.nextLine().trim();
        if (secondName.isEmpty()) {
            Name temp_name = new Name(firstName);
            getNames().add(temp_name);
            printList();
            return;
        }
        System.out.print("Отчество: ");
        String fatherName = sub_task.scanner.nextLine().trim();
        Name temp_name;
        if (fatherName.isEmpty()) {
            temp_name = new Name(firstName, secondName);
        } else {
            temp_name = new Name(secondName, firstName, fatherName);
        }
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