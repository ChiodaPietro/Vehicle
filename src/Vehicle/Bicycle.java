package Vehicle;

public class Bicycle extends Vehicle{
    boolean cycling_time;

    public Bicycle(String color, int brake_power, int acceleration, int max_speed, int luggage_space, int number_seats, boolean cycling_time, float speed) {
        super(color, brake_power, acceleration, max_speed, luggage_space, number_seats, speed);
        this.cycling_time = cycling_time;
    }
}
