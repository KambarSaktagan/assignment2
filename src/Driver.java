public class Driver {
    String name;
    String licenseNumber;

    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public void displayDriverInfo() {
        System.out.println("Driver: " + name + ", License: " + licenseNumber);
    }
}
