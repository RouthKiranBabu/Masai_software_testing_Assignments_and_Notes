class Person{
    String name;
    int age;
    String gender;
    Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void displayInfo(){
        System.out.println("Person: " + this.name + ".\nAge: " + this.age + ".\nGender: " + this.gender + ".\n");
    }
}

class Doctor extends Person{
    String specialization;
    static int doctorCount = 0;
    Doctor(String name, int age, String gender, String specialization){
        super(name, age, gender);
        this.specialization = specialization;
        doctorCount += 1;
    }
    public static int getDoctorCount() {
        return doctorCount;
    }
    @Override
    public void displayInfo(){
        System.out.println("Doctor: " + this.name + ".\nAge: " + this.age + ".\nGender: " + this.gender + ".\nSpecialization: " + this.specialization + ".\n");
    }
}

class Patient extends Person{
    String ailment;
    final int patientid;
    double[] treatmentCosts;
    Patient(String name, int age, String gender, String ailment, int patientid, double[] treatmentCosts){
        super(name, age, gender);
        this.ailment = ailment;
        this.patientid = patientid;
        this.treatmentCosts = treatmentCosts;
    }
    public double calculateTotalTreatmentCost() {
        double sum = 0;
        for(int i = 0; i < this.treatmentCosts.length; i ++){
            sum += this.treatmentCosts[i];
        }
        return sum;
    }
    @Override
    public void displayInfo(){
        String pc = "[";
        for (int i = 0; i < this.treatmentCosts.length - 1; i ++){
            pc += Double.toString(this.treatmentCosts[i]) + ", ";
        }
        pc += Double.toString(this.treatmentCosts[this.treatmentCosts.length - 1]) + "]";
        System.out.println("Patient: " + this.name + ".\nAge: " + this.age + ".\nGender: " + this.gender + ".\nAilment: " + this.ailment + ".\nPatient ID: " + this.patientid + ".\nTreatment Costs: " + pc + ".\nTotal Treatment Cost: " + this.calculateTotalTreatmentCost() + ".\n");
    }
}

class maxReached extends Exception{
    maxReached(String errmsg){
        super(errmsg);
    }
}

class Hospital{
    Doctor[] doctors = new Doctor[10];
    Patient[] patients = new Patient[10];
    static int doctorindex = 0;
    static int patientindex = 0;
    Hospital(){
        try{
            if(this.doctors.length > 10 && doctorindex != 0){
                throw new maxReached("Max 10 exceeded: Doctors array!");
            }
        }catch(maxReached mr){
            System.out.println(mr.getMessage());
        }
        try{
            if(this.patients.length > 10 && patientindex != 0){
                throw new maxReached("Max 10 exceeded: patients array!");
            }
        }catch(maxReached mr){
            System.out.println(mr.getMessage());
        }
        this.doctors = new Doctor[10];
        this.patients = new Patient[10];
    }
    public void addDoctor(Doctor doc) {
        this.doctors[doctorindex] = doc;
        doctorindex += 1;
    }
    public void addPatient(Patient pat) {
        this.patients[patientindex] = pat;
        patientindex += 1;
    }
    public void displayAllDoctors(){
        try{
            for(int i = 0; i < this.doctors.length; i ++){
                this.doctors[i].displayInfo();
            }
        }catch(NullPointerException npe){}
    }
    public void displayAllPatients(){
        try{
            for(int i = 0; i < this.patients.length; i ++){
                this.patients[i].displayInfo();
            }
        }catch(NullPointerException npe){}
    }
}

public class Solution{
    public static void main(String[] args){
        Hospital hospital = new Hospital();
        Doctor doc1 = new Doctor("Dr. Alice", 45, "Female", "Cardiology");
        Doctor doc2 = new Doctor("Dr. Bob", 50, "Male", "Neurology");
        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);

        Patient pat1 = new Patient("John", 30, "Male", "Heart Disease", 1001, new double[]{5000, 1500, 2500});
        Patient pat2 = new Patient("Mary", 25, "Female", "Migraine", 1002, new double[]{2000, 800, 600});
        hospital.addPatient(pat1);
        hospital.addPatient(pat2);

        hospital.displayAllDoctors();
        hospital.displayAllPatients();

        System.out.println("Total Doctors: " + Doctor.getDoctorCount());
    }
}
/*Output
Doctor: Dr. Alice.
Age: 45.
Gender: Female.
Specialization: Cardiology.

Doctor: Dr. Bob.
Age: 50.
Gender: Male.
Specialization: Neurology.

Patient: John.
Age: 30.
Gender: Male.
Ailment: Heart Disease.
Patient ID: 1001.
Treatment Costs: [5000.0, 1500.0, 2500.0].
Total Treatment Cost: 9000.0.

Patient: Mary.
Age: 25.
Gender: Female.
Ailment: Migraine.
Patient ID: 1002.
Treatment Costs: [2000.0, 800.0, 600.0].
Total Treatment Cost: 3400.0.

Total Doctors: 2

*/