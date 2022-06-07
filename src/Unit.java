//Создание персонажей, родительский класс остальных объектов

public class Unit {
    public String name;
    public int hp;
    public int attack;
    public int armor;
    public int power;


    public Unit(String name, int hp, int attack, int armor, int power) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.armor = armor;
        this.power = power;
    }
    //Атака без оружия
    public void attack(Unit target){
        if (power >= target.armor){
            target.hp -= attack;
            System.out.println(name+" атакует " + target.name + " наносит урон " + attack);
            if (target.hp <= 0){
                System.out.println(target.name + " убит ");
            }else {
                System.out.println(target.name + " осталось " + target.hp + " здоровья ");
            }
        }else {
            System.out.println(name + " не хватает силы, чтобы нанести урон " + target.name);
        }
    }
    //Атака с дополнительным оружием, сила суммируется
    public void attack(Unit target, Weapon item){
        power += item.power;
        attack *= 2;
        item.strength -= 1;
        System.out.println("Здоровье: " + item.strength);
        if (power >= target.armor){
            target.hp -= attack;
            System.out.println(name + " атакует " + target.name + " используя " + item.name + " наносит урон " + attack);
            if (target.hp <= 0) {
                System.out.println(target.name + " убит");
            } else {
                System.out.println(target.name + " осталось " + target.hp + " здоровья");
            }
        } else {
            System.out.println(name + " не хватает силы, чтобы нанести урон " + target.name);
        }
    }
    //Экипировка брони
    public void equip(Armor item){
        armor += item.armor;
        System.out.println(name + " надел " + item.name + " броня: " + armor);
    }
    //Эктипировка оружия
    public void equip(Weapon item){
        power += item.power;
        attack *= 2;
        System.out.println(name + " надел " + item.name + " оружие " + attack + " уровень силы: " + power);
    }
    //Реализовать инвентарь у персонажа и придумать как можно в случае победы над противником положить победителю
    //в инвентарь оружие и броню побежденного, у которого данные предметы должны пропасть.
    public void loot(Unit target){
        if (target.hp <= 0 && target.armor > 0){
            armor += target.armor;
            System.out.println(name + " забрал " + target.armor + " брони " + target.name);
        }else {
            System.out.println("Он еще жив!");
        }
    }


}