package Assignment4.Car;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.speed=100;
        System.out.println("The speed of the car is: "+car.speed);

        Accelerate accelerate = new Accelerate();
        accelerate.increaseSpeed();

        SlowDown slow = new SlowDown();
        slow.slowsDown();

    }
}
