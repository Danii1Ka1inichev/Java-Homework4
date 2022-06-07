
public class Run {

    public static void main(String[] args) {
        //Создаем персонажей
        Unit orc = new Unit("Орк", 100, 10, 10, 5); // Танк
        Elf elf = new Elf("Эльф", 100, 10, 10, 5, 5); // Лучник
        Undead undead = new Undead("Нежеть", 100, 10, 10, 5, 5); // Убийца
        Witch witch = new Witch("Ведьма", 100, 10, 10, 5, 5); // Маг
        Human human = new Human("Человек", 100, 100, 10, 100, 5); // Лекарь
        Dragon dragon = new Dragon("Дракон", 100, 10, 10, 5, 5); // РБ
        //Создаем оружие
        Weapon bow = new Weapon("Bow", 10, 20);
        Weapon axe = new Weapon("Axe", 10, 20);
        Weapon dagger = new Weapon("dagger", 10, 20);
        Weapon staff = new Weapon("staff", 10, 100);
        //Создаем броню
        Armor armor = new Armor("Armor", 10, 20);

        // метод вызова
        // атакуем дракона
        orc.attack(dragon);
        elf.attack(dragon);
        undead.attack(dragon);
        witch.attack(dragon);
        human.attack(dragon);
        //саботаж
        human.attack(orc);
        // дракон атакует
        dragon.attack(orc);
        dragon.attack(elf);
        dragon.attack(undead);
        dragon.attack(witch);
        dragon.attack(human);
        //надеть оружие и броню
        orc.equip(axe);
        orc.equip(armor);
        elf.equip(bow);
        elf.equip(armor);
        undead.equip(dagger);
        undead.equip(armor);
        witch.equip(staff);
        witch.equip(armor);
        human.equip(staff);
        human.equip(armor);
        //поднять вещь
        human.loot(orc);
    }
}
