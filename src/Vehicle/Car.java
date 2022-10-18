package Vehicle;

public class Car extends Vehicle {
    private boolean alarm;
    private boolean turned_on;
    private String car_sign;

    public Car(String color, int brake_power, int acceleration, int max_speed, int luggage_space, int number_seats, boolean alarm, boolean turned_on, String car_sign, float speed) {
        super(color, brake_power, acceleration, max_speed, luggage_space, number_seats, speed);
        this.alarm = alarm;
        this.turned_on = turned_on;
        this.car_sign = car_sign;
    }

    public void setAlarm(boolean alarm)   {
        this.alarm = alarm;
    }

    public void setTurned_on(boolean turned_on)  {
        this.turned_on = turned_on;
        if(turned_on) {
            setSpeed(1);
        }else {
            setSpeed(0);
        }
    }
    public boolean isAlarm() {
        return alarm;
    }

    public boolean isTurned_on() {
        return turned_on;
    }

    public String getCar_sign() {
        return car_sign;
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
