package tasks;

public class task1_3 implements sub_task {
    public class Name {
        private String secondName;
        private String firstName;
        private String fatherName;

        public Name(String secondName, String firstName, String fatherName) {
            this.secondName = secondName;
            this.firstName = firstName;
            this.fatherName = fatherName;
        }
        public Name(String firstName) {
            this(null, firstName, null);
        }
        public Name(String firstName, String secondName) {
            this(secondName, firstName, null);
        }
        public String getsecondName() { return secondName; }
        public String getFirstName() { return firstName; }
        public String getfatherName() { return fatherName; }
        public void setsecondName(String secondName) { this.secondName = secondName; }
        public void setfatherName(String fatherName) { this.fatherName = fatherName; }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (secondName != null && !secondName.isEmpty()) sb.append(secondName).append(" ");
            if (firstName != null && !firstName.isEmpty()) sb.append(firstName);
            if (fatherName != null && !fatherName.isEmpty()) {
                if (sb.length() > 0) sb.append(" ");
                sb.append(fatherName);
            }
            return sb.toString().trim();
        }
    }

    @Override
    public void show_task() {
        sub_task.super.show_task();
        Name name1 = new Name("Клеопатра");
        Name name2 = new Name( "Пушкин", "Александр", "Сергеевич");
        Name name3 = new Name( "Маяковский", "Владимир");
        System.out.println(name1.toString());
        System.out.println(name2.toString());
        System.out.println(name3.toString());
    }

    @Override
    public void add_new() {

    }
}
// Имена. Создайте сущность Имя, которая описывается тремя параметрами: Фамилия, Личное имя, Отчество.
// Имя может быть приведено к строковому виду, включающему традиционное представление всех трех параметров:
// Фамилия Имя Отчество (например “Иванов Иван Иванович”). Необходимо предусмотреть возможность того, что
// какой-либо из параметров может быть не задан, и в этом случае он не учитывается при приведении
// к текстовому виду. Необходимо создать следующие имена:
// • Клеопатра • Пушкин Александр Сергеевич • Маяковский Владимир Обратите внимание,
// что при выводе на экран, не заданные параметры никак не участвуют в образовании строки.