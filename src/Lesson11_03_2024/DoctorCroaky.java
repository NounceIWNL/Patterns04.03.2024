package Lesson11_03_2024;

//facade pattern

import java.util.ArrayList;
import java.util.List;

public class DoctorCroaky {
    public static void main(String[] args) {
        Story.tellStory();

    }
}

class Frog {
    public Frog went() {
        System.out.println("Went");
        return this;
    }

    public Frog sayHello() {
        System.out.println("Say hello");
        return this;
    }

    public Frog introduce() {
        System.out.println("Introduce");
        return this;
    }
    public Frog advertise() {
        System.out.println("Advertise");
        return this;
    }

    public Frog listen() {
        System.out.println("Listen to");
        return this;
    }
}

interface Animal {
    void come();
}

class Fox implements Animal {

    @Override
    public void come() {
        System.out.println("The Fox came");
    }

    public void ask() {
        System.out.println("The Fox asked");
    }
}

class Dear implements Animal {

    @Override
    public void come() {
        System.out.println("The Dear came");
    }
}

class Turtle implements Animal {

    @Override
    public void come() {
        System.out.println("The Turtle came");
    }
}

//Facade

class Story {
    private static List<Animal> animalList = new ArrayList<>();

    public static void tellStory() {
        Frog frog = new Frog();
        animalList.add(new Dear()); //anonymous object
        animalList.add(new Turtle());
        Animal fox = new Fox(); //named object
        animalList.add(fox);

        frog.went().sayHello();
        animalList.forEach(Animal::come);
        frog.introduce();
        frog.advertise();

        ((Fox)fox).ask();
        frog.listen();
    }
}
