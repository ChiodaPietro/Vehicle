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

    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }

    public void setTurned_on(boolean turned_on) {
        this.turned_on = turned_on;
        if(turned_on) {
            setAcceleration(1);
        }else {
            setAcceleration(0);
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
        float speed= time*getAcceleration();
    }
}
