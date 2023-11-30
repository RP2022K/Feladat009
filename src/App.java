public class App {
    public static void main(String[] args) throws Exception {
        Controller cont = new Controller();

        cont.start();
        cont.stop();
        cont.restart();
    }
}
