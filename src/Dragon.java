// Класс дракон - РБ с особым скиллом (Дышать огнем)
public class Dragon extends Unit{
    public int fireBreath;

    public Dragon(String name, int hp, int attack, int armor, int power, int fireBreath) {
        super(name, hp, attack, armor, power);
        this.fireBreath = fireBreath;
    }

}
