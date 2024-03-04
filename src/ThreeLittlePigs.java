public class ThreeLittlePigs {
    public static void main(String[] args) {

        Builder nifNif = new NifNif();
        Builder nafNaf = new NafNaf();
        Builder nufNuf = new NufNuf();

        Director wolf = new Director();
        wolf.setBuilder(nifNif);
        wolf.buildBasement(nifNif);
        wolf.buildWalls(nafNaf);
        wolf.buildRoof(nufNuf);
    }
}

interface Builder {
    void buildBasement();

    void buildWalls();

    void buildRoof();

}

class NifNif implements Builder {
    @Override
    public void buildBasement() {
        System.out.println("I built the soil base");
    }

    @Override
    public void buildWalls() {
        System.out.println("I built the clay walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("I built the straw roof");
    }
}

class NafNaf implements Builder {
    @Override
    public void buildBasement() {
        System.out.println("I built the sand base");
    }

    @Override
    public void buildWalls() {
        System.out.println("I built the sticks walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("I built the leaves roof");
    }
}

class NufNuf implements Builder {
    @Override
    public void buildBasement() {
        System.out.println("I built the concrete base");
    }

    @Override
    public void buildWalls() {
        System.out.println("I built the bricks walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("I built the tile roof");
    }
}

class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void buildHouse() {
        builder.buildBasement();
        builder.buildWalls();
        builder.buildRoof();
    }

    public void buildBasement(Builder builder) {
        builder.buildBasement();
    }

    public void buildWalls(Builder builder) {
        builder.buildWalls();
    }

    public void buildRoof(Builder builder) {
        builder.buildRoof();
    }
}
