package tasks;

import java.util.ArrayList;
import java.util.List;

public class task1_3 implements sub_task {

    private final List<Name> names = new ArrayList<>();

    public static class Name {
        private String secondName;
        private String firstName;
        private String fatherName;

        public Name(String secondName, String firstName, String fatherName) {
            this.secondName = secondName;
            this.firstName = firstName;
            this.fatherName = fatherName;
        }

        public Name(String firstName, String secondName) {
            this(secondName, firstName, null);
        }

        public Name(String firstName) {
            this(null, firstName, null);
        }

        public String getSecondName() { return secondName; }
        public String getFirstName() { return firstName; }
        public String getFatherName() { return fatherName; }
        public void setSecondName(String secondName) { this.secondName = secondName; }
        public void setFirstName(String firstName) { this.firstName = firstName; }
        public void setFatherName(String fatherName) { this.fatherName = fatherName; }

        @Override
        public String toString() {
            StringBuilder temp = new StringBuilder();
            if (secondName != null && !secondName.isEmpty()) temp.append(secondName).append(" ");
            if (firstName != null && !firstName.isEmpty()) temp.append(firstName);
            if (fatherName != null && !fatherName.isEmpty()) {
                if (!temp.isEmpty()) temp.append(" ");
                temp.append(fatherName);
            }
            return temp.toString().trim();
        }
    }

    public List<Name> getNames() { return names; }

    private void printList() {
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
        printList();
    }

    @Override
    public void add_new() {
        System.out.print("Фамилия: ");
        String secondName = sub_task.scanner.nextLine().trim();
        System.out.print("Имя: ");
        String firstName = sub_task.scanner.nextLine().trim();
        System.out.print("Отчество: ");
        String fatherName = sub_task.scanner.nextLine().trim();
        if (secondName.isEmpty()) secondName = null;
        if (firstName.isEmpty()) firstName = null;
        if (fatherName.isEmpty()) fatherName = null;
        if (secondName == null && firstName == null && fatherName == null) {
            System.err.println("Все поля пустые");
            return;
        }
        Name temp_name = new Name(secondName, firstName, fatherName);
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