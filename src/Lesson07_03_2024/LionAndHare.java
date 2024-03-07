package Lesson07_03_2024;

//bridge pattern
//структурное описание проложения

public class LionAndHare {
    public static void main(String[] args) {

        Lion lion = new CleverLion();
        Hare hare = new CleverHare();
        hare.meetWithLion(lion);
    }
}


abstract class Lion {
    public boolean wit;

    abstract public void meetWithHare(Hare hare);
}

abstract class Hare {
    public boolean wit;

    abstract public void meetWithLion(Lion lion);
}

class CleverHare extends Hare {
    public CleverHare() {
        this.wit = true;
    }

    @Override
    public void meetWithLion(Lion lion) {
        if (lion.wit)
            System.out.println("The Lion is clever, my attempt fails!");
        else System.out.println("The Lion is stupid, I will try to fool him!");
        lion.meetWithHare(this);
    }
}

class StupidLion extends Lion {
    public StupidLion() {
        this.wit = false;
    }

    @Override
    public void meetWithHare(Hare hare) {
        if (hare.wit)
            System.out.println("What? Another Lion in jungle!");
        else System.out.println("Another hare? I am very hungry.");
    }
}

class CleverLion extends Lion {

    public CleverLion() {
        this.wit = true;
    }

    public void meetWithHare(Hare hare) {
        if (hare.wit)
            System.out.println("The Hare is clever, I don't want to eat him.");
        else
            System.out.println("The Hare is stupid, I'd rather eat him.");
    }
}

class StupidHare extends Hare {
    public StupidHare(Lion lion) {
        this.wit = false;
    }

    @Override
    public void meetWithLion(Lion lion) {
        if (lion.wit)
            System.out.println("The Lion is clever! I can't do anything!");
        else System.out.println("The stupid Lion! I afraid him!");
        lion.meetWithHare(this);
    }
}