public class Weapon extends Item {
    public int power; // сила оружия

    public Weapon(String name, int strength, int power) {
        super(name, strength);
        this.power = power;
    }
    //Присвоение метода
    public static void gerWeapon(Unit target, Weapon name) {
        target.power += name.power;
        System.out.println("Сила " + target.name + " увеличина " + target.power);
    }
}
