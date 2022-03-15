public class VehicleRunner
{
  public static void main(String[] args)
  { 
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    
    // testing all available methods on a Car object
    Car myCar = new Car("Honda Civic", 4, "leather");
    System.out.println(myCar.getName()); // inherited method
    System.out.println(myCar.getWheels()); // inherited method
    System.out.println(myCar.getFabric()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.honk(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects
 
    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object
    
    Bicycle bicycle1 = new Bicycle("Bikael Biller", 2, 3);
    System.out.println(bicycle1.getName());
    System.out.println(bicycle1.getWheels());
    System.out.println(bicycle1.getGearCount());
    bicycle1.move(25);
    bicycle1.turn(90);
    bicycle1.brake(0.75);
    bicycle1.ringBell();

    // Test for Subway Object

    Subway train1 = new Subway("4 Train", 50, 20);
    System.out.println(train1.getName());
    System.out.println(train1.getWheels());
    System.out.println(train1.getAds());
    train1.move(50);
    train1.turn(10);
    train1.brake(0.97);
    train1.train();
    train1.closeDoors();
  }
}