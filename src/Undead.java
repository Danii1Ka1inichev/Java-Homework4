// Класс Нежить - убийца с особым скиллом яд
public class Undead extends Unit {
    public int poison;

    public Undead(String name, int hp, int attack, int armor, int power, int poison) {
        super(name, hp, attack, armor, power);
        this.poison = poison;
    }
}
