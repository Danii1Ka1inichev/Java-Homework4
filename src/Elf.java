//Класс Эльф - лучник с особым скиллом (пронзающая стрела)
public class Elf extends Unit {
    public int piercingArrow;

    public Elf(String name, int hp, int attack, int armor, int power, int piercingArrow) {
        super(name, hp, attack, armor, power);
        this.piercingArrow = piercingArrow;
    }
}
