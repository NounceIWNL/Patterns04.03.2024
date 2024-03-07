package Lesson07_03_2024;

public class PoundOfButter {
    public static void main(String[] args) {

    }
}

interface IProduct {
    double getWeight();

    void setWeight(double weight);
}

interface IProducer {
    IProduct make(double weight);
}


class Bread implements IProduct {
    private double weight;

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;

    }
}

class Butter implements IProduct {
    private double weight;

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;

    }
}