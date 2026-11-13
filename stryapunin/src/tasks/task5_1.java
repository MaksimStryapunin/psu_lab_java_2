package tasks;

public class task5_1 implements sub_task {

    private Pistol pistol;

    public static class Pistol {
        private int bullets;

        public Pistol() { this(5); }

        public Pistol(int bullets) {
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
            return "В пистолете " + bullets + " патронов";
        }
    }

    public Pistol getPistol() { return pistol; }

    @Override
    public void show_task() {
        pistol = new Pistol(3);
        for (int k = 0; k < 5; k++) {
            pistol.shoot();
        }
        pistol = null;
    }

    @Override
    public void add_new() {
        if (pistol != null) return;
        System.out.print("Кол-во патронов: ");
        String bullets = sub_task.scanner.nextLine().trim();
        if (bullets.isEmpty()) {
            this.pistol = new Pistol();
            return;
        }
        int intBullets;
        try {
            intBullets = Integer.parseInt(bullets);
        } catch (NumberFormatException e) {
            System.err.println("Некорректное число!");
            return;
        }
        if (intBullets < 0) {
            System.err.println("Патронов не может быть меньше нуля!");
            return;
        }
        pistol = new Pistol(intBullets);
        System.out.println("Enter — выстрел. 'q'/'quit'/'exit' — закончить.");

        while (true) {
            String input = sub_task.scanner.nextLine().trim().toLowerCase();
            if (input.equals("q") || input.equals("quit") || input.equals("exit")) {
                pistol = null;
                return;
            }
            pistol.shoot();
        }
    }
}
//Пистолет стреляет. • Создайте сущность Пистолет, которая описывается следующим образом:
// • Имеет Количество патронов (целое число) • Может быть создан с указанием начального количества
// патронов • Может быть создан без указания начального количества патронов, в этом случае он
// изначально заряжен пятью патронами. • Может Стрелять, что приводит к выводу на экран текста “Бах!”
// в том случае, если количество патронов больше нуля, иначе делает “Клац!”. После каждого выстрела
// (когда вывелся “Бах!”) количество патронов уменьшается на один. Создайте пистолет с тремя патронами
// и выстрелите из него пять раз.