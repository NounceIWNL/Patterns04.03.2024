package Lesson14_03_2024;

//decorator pattern (needed for the homework!)

public class Shopping {
    public static void main(String[] args) {
        Man man = new Shoemaker(new Tailor(new Pedestrian()));
        man.walk();


    }
}

interface Man {
    void walk();
}

class Pedestrian implements Man {
    @Override
    public void walk() {
        System.out.println("I go down the street");
    }
}

abstract class Decorator implements Man {
    protected Man man;

    public Decorator(Man man) {
        this.man = man;
    }

    @Override
    public void walk() {
        man.walk();
    }
}

class Shoemaker extends Decorator {

    public Shoemaker(Man man) {
        super(man);
    }

    @Override
    public void walk() {
        System.out.println("I made shoes for this man");
        super.walk();
    }
}

class Tailor extends Decorator {

    public Tailor(Man man) {
        super(man);
    }

    @Override
    public void walk() {
        System.out.println("I stitched suit for this man");
        super.walk();
    }
}