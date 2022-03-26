public class MainClass {

    public static void main(String[] args) {
        // create a new Simulation object with a random starting altitude
        Simulation game = new Simulation(new Vehicle(Simulation.randomaltitude()));
        // create a new BurnInputStream
        BurnInputStream burnSource = new BurnInputStream();
        // pass the new BurnInputStream to the runSimulation method
        game.runSimulation(burnSource);

    }

}
