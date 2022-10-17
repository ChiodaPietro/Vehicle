package Vehicle;

public class Vehicle {
    private String  color;
    private int brake_power, acceleration, max_speed, luggage_space, number_seats;
    private float speed;

    public Vehicle(String color, int brake_power, int acceleration, int max_speed, int luggage_space, int number_seats, float speed) {
        this.color = color;
        this.brake_power = brake_power;
        this.acceleration = acceleration;
        this.max_speed = max_speed;
        this.luggage_space = luggage_space;
        this.number_seats = number_seats;
        this.speed= speed;
    }
    public int getMax_speed() {
        return max_speed;
    }

    public int getLuggage_space() {
        return luggage_space;
    }

    public int getNumber_seats() {
        return number_seats;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public int getBrake_power() {
        return brake_power;
    }

    public int getAcceleration() {
        return acceleration;
    }
    public float getSpeed(){
        return this.speed;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }
}
