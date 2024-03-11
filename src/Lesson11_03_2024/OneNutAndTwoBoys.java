package Lesson11_03_2024;

//Mediator pattern

public class OneNutAndTwoBoys {
    public static void main(String[] args) {


    }
}

interface Mediator {

    public void response();

    public void setTotal(int total);

}

abstract class Boy {

    protected final Mediator mediator;

    public Boy(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive(int count);

    public abstract void request(int count);
}

