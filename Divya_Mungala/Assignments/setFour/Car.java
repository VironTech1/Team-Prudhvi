package setFour;

public class Car {
	  //properties 
    private double speed; 

    public Car(){//constructor
        this.speed = 0.0; //speed is zero
    }

   
    public void accelerate(double accelerationAmount) {
       
        this.speed += accelerationAmount; //accelerate time
    }

    
    public void applyBrakes(double brakeAmount) { //breaktime
        
        if (this.speed >= brakeAmount) {
            this.speed -= brakeAmount;
        } else {
            this.speed = 0; 
        }
    }
//method to get current speed 
    
    public double getSpeed() {
        return this.speed;
    }

    
    public static void main(String[] args) {
        //creating car object
        Car myCar = new Car();

        myCar.accelerate(30.0);
        System.out.println("Current speed after accelerating: " + myCar.getSpeed());

        myCar.applyBrakes(20.0);
        System.out.println("Current speed after applying brakes: " + myCar.getSpeed());
    }
}
