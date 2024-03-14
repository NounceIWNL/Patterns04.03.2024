package Lesson14_03_2024;

//Prototype

public class SillyLittleMariam {
    public static void main(String[] args) {
        Girl mariam = new Girl("Mariam");
        System.out.println(mariam.toString());

        Girl noMariam = (Girl) mariam.clone();
        noMariam.setName("Not Mariam");
        noMariam.setLazy(false);
        noMariam.setSilly(false);
        System.out.println(noMariam.toString());


    }
}

class Girl implements Cloneable {
    private String name;
    private boolean silly = true;
    private boolean lazy = true;
    private boolean little = true;

    public Girl(String name) {
        this.name = name;
    }

    @Override
    public Girl clone() {
        try {
            Girl clone = (Girl) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", silly=" + silly +
                ", lazy=" + lazy +
                ", little=" + little +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSilly(boolean silly) {
        this.silly = silly;
    }

    public void setLazy(boolean lazy) {
        this.lazy = lazy;
    }

    public void setLittle(boolean little) {
        this.little = little;
    }

    public String getName() {
        return name;
    }

    public boolean isSilly() {
        return silly;
    }

    public boolean isLazy() {
        return lazy;
    }

    public boolean isLittle() {
        return little;
    }
}
