//Родительский класс оружия и брони(инвентарь)

public abstract class Item {
    public String name; // имя
    public int strength; // прочность

    public Item(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }
}


