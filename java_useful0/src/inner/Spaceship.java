package inner;

/**
 * Static Inner class
 */
public class Spaceship {

    private Engine innerEngine;

    // Engine add in spaceship
    public void addEngine(Engine engine) {
        innerEngine = engine;
    }

    public void startSpaceShip() {
        if (innerEngine == null) {
            System.out.println("Engine should be equipped first");
        } else {
            System.out.println("Leaving to the Moon from now on, Brrr..!! ");
        }
    }

    // static inner class
    public static class Engine {

        public static int ENGINE_COUNT = 0;
        private int serialNumber;

        public Engine() {
            ENGINE_COUNT++;
            this.serialNumber = ENGINE_COUNT;
        }

        public void start() {
            System.out.println("Engine " + serialNumber + " activated! Brrr...");
        }

    } // end of inner Engine


}
