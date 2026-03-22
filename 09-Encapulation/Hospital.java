package Encapulation;


interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println(patientId);
        System.out.println(name);
        System.out.println(age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    private int days;
    private double dailyCharge;
    private String record;

    public InPatient(int id, String name, int age, int days, double charge) {
        super(id, name, age);
        this.days = days;
        this.dailyCharge = charge;
    }

    public double calculateBill() {
        return days * dailyCharge;
    }

    public void addRecord(String record) {
        this.record = record;
    }

    public void viewRecords() {
        System.out.println("Record: " + record);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String record;

    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        this.record = record;
    }

    public void viewRecords() {
        System.out.println("Record: " + record);
    }
}

public class Hospital {
    public static void main(String[] args) {

        Patient p1 = new InPatient(1, "Rahul", 30, 5, 2000);
        Patient p2 = new OutPatient(2, "Aman", 25, 500);

        Patient[] patients = {p1, p2};

        for (Patient p : patients) {
            p.getPatientDetails();

            System.out.println("Bill: " + p.calculateBill());

            MedicalRecord m = (MedicalRecord) p;
            m.addRecord("General Checkup");
            m.viewRecords();

            System.out.println();
        }
    }
}
