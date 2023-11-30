/*
* File: App.java
* Author: Gyüre Árpád
* Copyright: 2023, Gyüre Árpád
* Group: Szoft II-1-E
* Date: 2023-11-30
* Github: https://github.com/RP2022K/Feladat009.git
* Licenc: GNU GPL
*/

public class App {
    public static void main(String[] args) throws Exception {
        Controller cont = new Controller();

        cont.start();
        cont.stop();
        cont.restart();
    }
}
