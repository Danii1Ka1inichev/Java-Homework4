public class Armor extends Item{
    public int armor;
    public Armor(String name,int strength, int armor) {
        super(name, strength);
        this.armor = armor;
    }
    //Присвоение предмета
    public static void getArmor(Unit target, Armor name) {
        target.armor += name.armor;
        System.out.println("Броня " + target.name + " увеличена " + target.armor);
    }
}
