//Класс Человек - лекарь с особым скилом (лечить)
public class Human extends Unit {
    public int heals;

    public Human(String name, int hp, int attack, int armor, int power, int heals) {
        super(name, hp, attack, armor, power);
        this.heals = heals;
    }
}


