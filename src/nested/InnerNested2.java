package nested;

public class InnerNested2 {
    public static void main(String[] args) {

        Car car = new Car();
        car.driver.go();

        Car.Player passenger = new Car.Player();
        passenger.play();
        System.out.println(Car.playerOn);

        car.move();
        car.play();
    }
}

class Car {
    //Руль находится внутри автомобиля, поэтому private

    private int wheelAngle = 0; //Angle of rotating

    private boolean ignitionOn = false; //Key of ignition

    //Плейер
    public static boolean playerOn = false; //Car's player
    public Driver driver = new Driver();

    //inner class
    protected class Driver {
        public void go() {
            wheelAngle = 30;
            ignitionOn = true;
            playerOn = true;
        }

    }

    //статический вложенный класс
    public static class Player {
        public void play() {
            Car.playerOn = true;
        }
    }

    //Local class
    public void move() {
        class Navigator {
            public void navigate() {
                System.out.println("navigate");
            }
        }
        Navigator navigator = new Navigator();
        navigator.navigate();
    }

    //Чтобы создать анонимный класс, нужен родительский класс или интерфейс
    interface Remotable {
        void remote();
    }

    //Anonymous class
    public void play() {
        new Remotable() {
            @Override
            public void remote() {
                playerOn = true;
                System.out.println("play");
            }
        }.remote();
    }
}
