public class Controller implements Controllable {
    public void start() {
        System.out.println("Indulás");
    }

    public void stop() {
        System.out.println("Megállás");
    }

    public void restart() {
        System.out.println("Újraindulás");
    }
}
