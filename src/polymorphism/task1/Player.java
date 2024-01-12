package polymorphism.task1;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[]{
                // TODO заполнить слоты оружием
                new Gun(),
                new Gun(),
                new Automatic()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot > weaponSlots.length) {
            System.out.println("Прощай");
        }
        if (slot == -1) {
            System.out.println("Прощай");
        } else {
            // TODO если значение slot больше значения последнего элемента массива, то
            // выйти из метода написав об этом в консоль

            // Получаем оружие из выбранного слота
            Weapon weapon = weaponSlots[slot];
            // Огонь!
            weapon.shot();
        }
    }
}