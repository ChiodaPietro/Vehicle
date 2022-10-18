package Vehicle;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean exit = false;
        Car ronny = new Car("gray", 30, 20, 225, 8, 7, true, false, "ABB 1234 BVX", 0);
        Bicycle coleman = new Bicycle("orange", 10, 5, 40, 1, 1, false, 0);
        while (true) {
            System.out.println("car or bike?");
            String menu = sc.next().toLowerCase();
            System.out.println("to brake just write brake after you have completed an action");
            switch (menu) {

                case "car":

                    try {
                        System.out.println("turn on the car?true/false");
                        ronny.setTurned_on(sc.nextBoolean());
                        System.out.println("you must turn off the alarm: false");
                        ronny.setAlarm(sc.nextBoolean());
                    } catch (InputMismatchException e) {
                        sc.next();
                        System.out.println("you must write a boolean ");
                    }
                    while (!exit && !ronny.isAlarm()) {
                        System.out.println("the car is on");
                        System.out.println("menu: accelerate, brake, exit");
                        menu = sc.next();
                        switch (menu) {

                            case "accelerate":
                                System.out.println("the acceleration is: " + ronny.getAcceleration() + "km/h gained each second, how much time do you want to accelrate?");
                                ronny.accelerate(sc.nextFloat());
                                System.out.println("speed: " + ronny.getSpeed());
                                break;
                            case "brake":
                                System.out.println("brake power: " + ronny.getBrake_power());
                                ronny.brake(sc.nextFloat());
                                System.out.println("speed: " + ronny.getSpeed());
                                break;
                            case "exit":
                                System.out.println("turn off the car?");
                                exit = sc.nextBoolean();
                                break;

                        }

                    }
                    break;
                case "bike":
                    exit = false;
                    while (!exit) {
                        System.out.println("accelerate, brake, exit");
                        menu=sc.next();
                        switch (menu) {

                            case "accelerate":
                                System.out.println("the acceleration is: " + coleman.getAcceleration() + "km/h gained each second, how much time do you want to accelrate?");
                                coleman.accelerate(sc.nextFloat());
                                System.out.println("speed: " + coleman.getSpeed());
                                break;
                            case "brake":
                                System.out.println("brake power: " + coleman.getBrake_power());
                                coleman.brake(sc.nextFloat());
                                System.out.println("speed: " + coleman.getSpeed());
                                break;
                            case "exit":
                                System.out.println("leave the bike? true/ false");
                                exit = sc.nextBoolean();
                                break;
                        }

                    }
                    break;
            }
        }
    }
}
