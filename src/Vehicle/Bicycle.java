package Vehicle;

public class Bicycle extends Vehicle{
    boolean cycling_time;

    public Bicycle(String color, int brake_power, int acceleration, int max_speed, int luggage_space, int number_seats, boolean cycling_time, float speed) {
        super(color, brake_power, acceleration, max_speed, luggage_space, number_seats, speed);
        this.cycling_time = cycling_time;
    }
    public void accelerate(float time){
        if(time*getAcceleration()<getMax_speed()) {
            setSpeed(time * getAcceleration());
        }else {
            System.out.println("you wanted to accelerate for too long, you are at max speed");
            setSpeed(getMax_speed());
        }
    }
    public void brake(float time){
        if(getSpeed()-(time*getBrake_power())<=0) {
            System.out.println("too much time to brake, your speed is now zero and the car is off ");
            setSpeed(0);
        }else {
            setSpeed(getSpeed() - (time * getBrake_power()));
        }
    }
}
