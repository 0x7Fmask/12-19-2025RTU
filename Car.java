public class Car {
    String brand, model;
    int year, speed;

    Engine engine;
    String gearbox;
    int wheelSize;

    public Car(String brand, String model, int year, Engine engine, String gearbox, int wheelSize) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.gearbox = gearbox;
        this.wheelSize = wheelSize;
        this.speed = 0;
    }

    public void start() {
        engine.start();
    }

    public void gas() {
        speed += 10;
    }

    public void brake() {
        speed = Math.max(0, speed - 10);
    }

    public String toString() {
        return brand + " " + model + " (" + year + "), HP=" + engine.hp +
                ", ātrumkārba=" + gearbox + ", riepas=" + wheelSize + "\'coll";
    }

    public String toFileLine() {
        return brand + ";" + model + ";" + year + ";" + speed + ";" + engine.hp + ";" + gearbox + ";" + wheelSize;
    }
}
