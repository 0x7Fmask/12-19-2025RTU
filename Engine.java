public class Engine {
    int hp;
    boolean running;
    int temperature;

    public Engine(int hp) {
        this.hp = hp;
        this.running = false;
        this.temperature = 20;
    }
    public void start() { running = true; temperature = 90; }
    public void stop() { running = false; temperature = 20; }
    public boolean isRunning() { return running; }
}
