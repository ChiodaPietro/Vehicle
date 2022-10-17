package Vehicle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Car ronny= new Car("gray", 30, 20, 225,8, 7, true, false, "ABB 1234 BVX", 0);
        Bicycle coleman= new Bicycle("orange", 10, 5, 40, 1, 1, false, 0);
        String menu= sc.next().toLowerCase();
        switch (menu){
            case "carspeedup":
                System.out.println("turn on the car?");
                ronny.setTurned_on(sc.nextBoolean());
                System.out.println("how much time?");
                ronny.accelerate(sc.nextInt());
                System.out.println(ronny.getSpeed());
        }
    }
}
