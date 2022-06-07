//Класс Ведьма - маг с особымк скилом (Ледяная буря)
public class Witch extends Unit{

    public int icestorm;

    public Witch(String name, int hp, int attack, int armor, int power, int icestorm) {
        super(name, hp, attack, armor, power);
        this.icestorm = icestorm;
    }

}
