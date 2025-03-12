class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    // Constructor
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Method to display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    // Method to display total number of patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        System.out.println("Patient Details:");

        Patient patient1 = new Patient(101, "Alice", 20, "Fever");
        patient1.displayPatientDetails();

        Patient patient2 = new Patient(102, "Charlie", 21, "Cold");
        patient2.displayPatientDetails();

        Patient.getTotalPatients();
    }
}

/*
Output:
    Patient Details:
    Hospital Name: City Hospital
    Patient ID: 101
    Name: Alice
    Age: 20
    Ailment: Fever
    Hospital Name: City Hospital
    Patient ID: 102
    Name: Charlie
    Age: 21
    Ailment: Cold
    Total Patients Admitted: 2
 */