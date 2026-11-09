package tasks;

import java.util.ArrayList;
import java.util.List;

public class task1_3 implements sub_task {

    private final List<Name> names = new ArrayList<>();

    public static class Name {
        private String surname;
        private String firstName;
        private String patronymic;

        public Name(String surname, String firstName, String patronymic) {
            this.surname = surname;
            this.firstName = firstName;
            this.patronymic = patronymic;
        }

        public Name(String firstName, String surname) {
            this(surname, firstName, null);
        }

        public Name(String firstName) {
            this(null, firstName, null);
        }

        public String getSurname() { return surname; }
        public String getFirstName() { return firstName; }
        public String getPatronymic() { return patronymic; }
        public void setSurname(String surname) { this.surname = surname; }
        public void setFirstName(String firstName) { this.firstName = firstName; }
        public void setPatronymic(String patronymic) { this.patronymic = patronymic; }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (surname != null && !surname.isEmpty()) sb.append(surname).append(" ");
            if (firstName != null && !firstName.isEmpty()) sb.append(firstName);
            if (patronymic != null && !patronymic.isEmpty()) {
                if (sb.length() > 0) sb.append(" ");
                sb.append(patronymic);
            }
            return sb.toString().trim();
        }
    }

    public List<Name> getNames() { return names; }

    private void printList() {
        for (Name n : names) {
            System.out.println(" - " + n);
        }
    }

    @Override
    public void show_task() {
        names.clear();
        names.add(new Name("Клеопатра"));
        names.add(new Name("Пушкин", "Александр", "Сергеевич"));
        names.add(new Name("Владимир", "Маяковский"));
        printList();
    }

    @Override
    public void add_new() {
        System.out.print("Фамилия: ");
        String surname = sub_task.scanner.nextLine().trim();
        System.out.print("Личное имя: ");
        String firstName = sub_task.scanner.nextLine().trim();
        System.out.print("Отчество: ");
        String patronymic = sub_task.scanner.nextLine().trim();
        if (surname.isEmpty()) surname = null;
        if (firstName.isEmpty()) firstName = null;
        if (patronymic.isEmpty()) patronymic = null;
        Name temp_name = new Name(surname, firstName, patronymic);
        getNames().add(temp_name);
        printList();
    }
}
// Имена. Создайте сущность Имя, которая описывается тремя параметрами: Фамилия, Личное имя, Отчество.
// Имя может быть приведено к строковому виду, включающему традиционное представление всех трех параметров:
// Фамилия Имя Отчество (например “Иванов Иван Иванович”). Необходимо предусмотреть возможность того, что
// какой-либо из параметров может быть не задан, и в этом случае он не учитывается при приведении
// к текстовому виду. Необходимо создать следующие имена:
// • Клеопатра • Пушкин Александр Сергеевич • Маяковский Владимир Обратите внимание,
// что при выводе на экран, не заданные параметры никак не участвуют в образовании строки.