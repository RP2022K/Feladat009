/*
* File: Controller.java
* Author: Gyüre Árpád
* Copyright: 2023, Gyüre Árpád
* Group: Szoft II-1-E
* Date: 2023-11-30
* Github: https://github.com/RP2022K/Feladat009.git
* Licenc: GNU GPL
*/

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
