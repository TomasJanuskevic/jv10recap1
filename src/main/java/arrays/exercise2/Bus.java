package arrays.exercise2;

import java.util.Arrays;

public class Bus {

    String destination;
    Passenger[] passengers;

    public void drivePassenger(){
        Arrays.stream(passengers).forEach(passenger-> System.out.println("Driving passenger: " + passenger));
    }
    
    public void driveItems(Item[] items){
        for (int i = 0; i < items.length; i++) {
            System.out.println("Driving item: " + items[i]);
        }
    }
}
