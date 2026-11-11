package tasks;

import java.util.ArrayList;
import java.util.List;

public class task1_2 implements sub_task {

    private final List<Person> persons = new ArrayList<>();

    public class Person {
        private String Name;
        private int height;

        public Person(String Name, int height) {
            this.Name = Name;
            this.height = height;
        }

        public String getName() { return Name; }
        public int getHeight() { return height; }

        @Override
        public String toString() {
            return "* Человек с именем " + Name + " и ростом " + height;
        }
    }

    public List<Person> getPersons() { return persons; }

    private void printList() {
        for (Person p : persons) {
            System.out.println(p);
        }
    }

    @Override
    public void show_task() {
        persons.clear();
        persons.add(new Person("Клеопатра", 152));
        persons.add(new Person("Пушкин", 167));
        persons.add(new Person("Владимир", 189));
        printList();
    }

    @Override
    public void add_new() {
        System.out.print("Имя: ");
        String Name = sub_task.valid.readLine();
        System.out.print("Рост: ");
        int height = sub_task.valid.readInt(0, 1000);
        Person temp_person = new Person(Name, height);
        getPersons().add(temp_person);
        printList();
    }
}
// Человек. Создайте сущность Человек, которая описывается: • Имя: строка • Рост: целое число Может
// возвращать текстовое представление вида “Name, рост: height”, где Name и height это переменная с именем
// и ростом. Необходимо создать и вывести на экран следующих людей: • Человек с именем “Клеопатра” и ростом 152
// • Человек с именем “Пушкин ” и ростом 167 • Человек с именем “Владимир ” и ростом 189