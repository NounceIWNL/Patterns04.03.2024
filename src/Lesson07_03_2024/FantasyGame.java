package Lesson07_03_2024;
//abstract factory
//абстрактная фабрика , фабрика фабрик



public class FantasyGame {
    public static void main(String[] args) {
// Races: human, elf, orcs
// Classes: warrior, hunter, mage
// Barracks

        Barracks humanBarracks = new HumanBarracks();
        Barracks orcBarracks = new OrcBarracks();
        Barracks elfBarracks = new ElfBarracks();

        Warrior warrior1 = humanBarracks.createWarrior();
        warrior1.attack();
        Hunter hunter1 = humanBarracks.createHunter();
        hunter1.shoot();
        Mage mage1 = humanBarracks.createMage();
        mage1.cast();

        Warrior warrior2 = elfBarracks.createWarrior();
        warrior2.attack();
        Hunter hunter2 = elfBarracks.createHunter();
        hunter2.shoot();
        Mage mage2 = elfBarracks.createMage();
        mage2.cast();

        Warrior warrior3 = orcBarracks.createWarrior();
        warrior3.attack();
        Hunter hunter3 = orcBarracks.createHunter();
        hunter3.shoot();
        Mage mage3 = orcBarracks.createMage();
        mage3.cast();
    }
}

abstract class Barracks {
    public abstract Warrior createWarrior();

    public abstract Hunter createHunter();

    public abstract Mage createMage();
}



interface Warrior {
    void attack();
}

interface Hunter {
    void shoot();
}

interface Mage {
    void cast();
}

class HumanWarrior implements Warrior {
    @Override
    public void attack() {
        System.out.println("The human warrior is attacking with sword.");
    }
}

class HumanHunter implements Hunter {
    @Override
    public void shoot() {
        System.out.println("The human hunter is shooting with bow.");
    }
}

class HumanMage implements Mage {
    @Override
    public void cast() {
        System.out.println("The human mage is casting with wand.");
    }
}

class HumanBarracks extends Barracks {

    @Override
    public Warrior createWarrior() {
        return new HumanWarrior();
    }

    @Override
    public Hunter createHunter() {
        return new HumanHunter();
    }

    @Override
    public Mage createMage() {
        return new HumanMage();
    }
}

class ElfWarrior implements Warrior {
    @Override
    public void attack() {
        System.out.println("The elf warrior is attacking with sword.");
    }
}

class ElfHunter implements Hunter {
    @Override
    public void shoot() {
        System.out.println("The elf hunter is shooting with bow.");
    }
}

class ElfMage implements Mage {
    @Override
    public void cast() {
        System.out.println("The elf mage is casting with wand.");
    }
}

class ElfBarracks extends Barracks {

    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }

    @Override
    public Hunter createHunter() {
        return new ElfHunter();
    }

    @Override
    public Mage createMage() {
        return new ElfMage();
    }
}

class OrcWarrior implements Warrior {
    @Override
    public void attack() {
        System.out.println("The orc warrior is attacking with sword.");
    }
}

class OrcHunter implements Hunter {
    @Override
    public void shoot() {
        System.out.println("The orc hunter is shooting with bow.");
    }
}

class OrcMage implements Mage {
    @Override
    public void cast() {
        System.out.println("The orc mage is casting with wand.");
    }
}

class OrcBarracks extends Barracks {

    @Override
    public Warrior createWarrior() {
        return new OrcWarrior();
    }

    @Override
    public Hunter createHunter() {
        return new OrcHunter();
    }

    @Override
    public Mage createMage() {
        return new OrcMage();
    }
}