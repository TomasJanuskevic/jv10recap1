package arrays.exercise2;

public class Main {
    public static void main(String[] args) {

        Passenger vidas = new Passenger();
        vidas.name = "Vidas";
        vidas.age = 18;

        Passenger nijole = new Passenger();
        nijole.name = "Nijole";
        nijole.age = 21;

        Passenger[] passengers = new Passenger[5];
        passengers[0] = vidas;
        passengers[1] = nijole;

        Bus bus = new Bus();
        bus.destination = "Palanga";
        bus.passengers = passengers;
        bus.drivePassenger();

        Item chair = new Item("Chair", 2, 10);
    }
}
