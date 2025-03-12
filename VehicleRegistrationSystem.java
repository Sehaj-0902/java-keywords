class Vehicle {
    private static double registrationFee = 500;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    // Constructor
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) { // Using instanceof
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: Rs." + registrationFee);
        }
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        System.out.println("Vehicle Details:");

        Vehicle vehicle1 = new Vehicle("XYZ123", "Alice", "Car");
        vehicle1.displayVehicleDetails();

        Vehicle vehicle2 = new Vehicle("ABC123", "Charlie", "Motorcycle");
        vehicle2.displayVehicleDetails();
    }
}

/*
Output:
    Vehicle Details:
    Registration Number: XYZ123
    Owner Name: Alice
    Vehicle Type: Car
    Registration Fee: Rs.500.0
    Registration Number: ABC123
    Owner Name: Charlie
    Vehicle Type: Motorcycle
    Registration Fee: Rs.500.0
 */
