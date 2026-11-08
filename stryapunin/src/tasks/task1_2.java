package tasks;

public class task1_2 implements sub_task {
    public class Person {
        private String name;
        private int height;

        public Person() {}
        public Person(String name, int height) {
            this.name = name;
            this.height = height;
        }

        public String getName() { return name;}
        public int getHeight() { return height;}

        public void setName() {this.name = name;}
        public void setHeight() {this.height = height;}

        @Override
        public String toString() {
            return name + ", рост: " + height;
        }
    }

    @Override
    public void show_task() {
        Person p1 = new Person("Клеопатра", 152);
        Person p2 = new Person("Пушкин", 167);
        Person p3 = new Person("Владимир", 189);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
// Человек. Создайте сущность Человек, которая описывается: • Имя: строка • Рост: целое число Может
// возвращать текстовое представление вида “Name, рост: height”, где Name и height это переменная с именем
// и ростом. Необходимо создать и вывести на экран следующих людей: • Человек с именем “Клеопатра” и ростом 152
// • Человек с именем “Пушкин ” и ростом 167 • Человек с именем “Владимир ” и ростом 189