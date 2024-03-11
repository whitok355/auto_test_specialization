package seminars.second.hw;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class VehicleTest {
    Car car = new Car("BMW", "X2", 1990);
    Motorcycle motorcycle = new Motorcycle("Audi", "ms2", 2000);

    @Test
    public void testInstanceVehicle(){
        assertTrue(car instanceof Vehicle);
    }
    @Test
    public void testQuantityWheelsCar(){
        assertEquals(car.getNumWheels(), 4);
    }
    @Test
    public void testQuantityWheelsMotorcycle(){
        assertEquals(motorcycle.getNumWheels(), 2);
    }
    @Test
    public void testSpeedCar(){
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }
    @Test
    public void testSpeedMotorcycle(){
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }
    @Test
    public void testParkCar(){
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }
    @Test
    public void testParkMotorcycle(){
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(car.getSpeed(), 0);
    }
}