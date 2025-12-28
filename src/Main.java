public class Main {
    public static void main(String[] args) {
        Driver d1 = new Driver("John Doe", "A12345");
        Driver d2 = new Driver("Emily Fox", "B98765");

        Vehicle car = new Car("Toyota", 2020, 4, "Petrol", d1);
        Vehicle moto = new Motorcycle("Yamaha", 2022, false, d2);
        Vehicle truck = new Truck("Volvo", 2019, 12.5, 4, d1);

        Vehicle[] vehicles = {car, moto, truck};

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            v.showDriver();
            v.stopEngine();
            System.out.println();
        }
    }
}
