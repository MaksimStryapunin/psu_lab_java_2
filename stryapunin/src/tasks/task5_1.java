package tasks;

public class task5_1 implements sub_task {

    private Pistol pistol;

    public class Pistol {
        private int bullets;

        public Pistol() { this(5); }

        public Pistol(int bullets) {
            if (bullets < 0) {
                throw new IllegalArgumentException("Количество патронов не может быть отрицательным");
            }
            this.bullets = bullets;
        }

        public void shoot() {
            if (bullets > 0) {
                System.out.println("Бах!");
                bullets--;
            } else {
                System.out.println("Клац!");
            }
        }

        public int getBullets() { return bullets; }
        public void setBullets(int bullets) { this.bullets = bullets; }

        @Override
        public String toString() {
            return "Пистолет [патронов: " + bullets + "]";
        }
    }

    public Pistol getPistol() { return pistol; }

    @Override
    public void show_task() {
        pistol = new Pistol(3);
        for (int k = 0; k < 5; k++) {
            pistol.shoot();
        }
    }

    @Override
    public void add_new() {
        if (getPistol() == null) {
            System.out.println("Пистолет ещё не создан — сначала запустите задачу.");
            return;
        }
        System.out.print("Сколько патронов добавить: ");
        String s = sub_task.scanner.nextLine().trim();
        int delta;
        try {
            delta = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Некорректное число — отмена.");
            return;
        }
        getPistol().setBullets(getPistol().getBullets() + delta);
        System.out.println("Патронов теперь: " + getPistol().getBullets());
    }
}
//Пистолет стреляет. • Создайте сущность Пистолет, которая описывается следующим образом:
// • Имеет Количество патронов (целое число) • Может быть создан с указанием начального количества
// патронов • Может быть создан без указания начального количества патронов, в этом случае он
// изначально заряжен пятью патронами. • Может Стрелять, что приводит к выводу на экран текста “Бах!”
// в том случае, если количество патронов больше нуля, иначе делает “Клац!”. После каждого выстрела
// (когда вывелся “Бах!”) количество патронов уменьшается на один. Создайте пистолет с тремя патронами
// и выстрелите из него пять раз.