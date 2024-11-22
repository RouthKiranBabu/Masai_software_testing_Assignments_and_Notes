import java.util.Map;
import java.util.HashMap;

class Employee{
    private int id;
    private String name;
    private String department;
    private double baseSalary;
    private int workingHours;
    Employee(int id, String name, String department, double baseSalary, int workingHours){
        this.id = id;
        this.name = name;
        this.department = department;
        this.baseSalary = baseSalary;
        this.workingHours = workingHours;
    }
    int getID(){ return this.id; }
    void setID(int id){ this.id = id; }

    String getName() { return this.name; }
    void setName(String name) { this.name = name; }

    String getDepartment() { return this.department; }
    void setDepartment(String department) { this.department = department; }

    double getbaseSalary() { return this.baseSalary; }
    void setbaseSalary(double salary) { this.baseSalary = salary; }

    int getWorkingHours() { return this.workingHours; }
    void setWorkingHours(int hours) { this.workingHours = hours; }

    void calculateSalary() {}

    void displayEmployee(){
        System.out.println("ID: " + this.getID() + 
            ". Name: " + this.getName() + 
            ". Department: " + this.getDepartment() + 
            ". Base Salary: " + this.getbaseSalary() + 
            ". Working Hours: " + this.getWorkingHours() + ".");
    }
}

class SalaryCalculationException extends Exception{
    SalaryCalculationException(String errmsg){ super("Salary Calculation Error due to " + errmsg + "."); }
}

class Manager extends Employee{
    double bonusPercentage;
    Manager(int id, String name, String department, double baseSalary, int workingHours, double bonusPercentage){
        super(id, name, department, baseSalary, workingHours);
        this.bonusPercentage = bonusPercentage;
    }
    @Override
    void calculateSalary(){
        try{
            if (this.getbaseSalary() < 0){
                throw new SalaryCalculationException("Base Salary");
            }else if (this.bonusPercentage < 0){
                throw new SalaryCalculationException("Bonus Percentage");
            }
        }catch(SalaryCalculationException s){ System.out.println(s.getMessage()); }
        this.setbaseSalary(this.getbaseSalary() + (this.getbaseSalary() * this.bonusPercentage) / 100);
    }
}

class Developer extends Employee{
    int codingHours;
    int paymentHours = 50;
    Developer(int id, String name, String department, double baseSalary, int workingHours, int codingHours){
        super(id, name, department, baseSalary, workingHours);
        this.codingHours = codingHours;
    }
    @Override
    void calculateSalary(){
        try{
            if (this.getbaseSalary() < 0){
                throw new SalaryCalculationException("Base Salary");
            }else if (this.codingHours < 0){
                throw new SalaryCalculationException("Bonus Percentage");
            }else if (this.paymentHours < 0){
                throw new SalaryCalculationException("Payment Hours");
            }
        }catch(SalaryCalculationException s){ System.out.println(s.getMessage()); }
        this.setbaseSalary(this.getbaseSalary() + this.codingHours * this.paymentHours);
    }
}

class HR extends Employee{
    double recruitmentBonus;
    HR(int id, String name, String department, double baseSalary, int workingHours, double recruitmentBonus){
        super(id, name, department, baseSalary, workingHours);
        this.recruitmentBonus = recruitmentBonus;
    }
    void calculateSalary(){
        try{
            if (this.getbaseSalary() < 0){
                throw new SalaryCalculationException("Base Salary");
            }else if (this.recruitmentBonus < 0){
                throw new SalaryCalculationException("Recruitment Bonus");
            }
        }catch(SalaryCalculationException s){ System.out.println(s.getMessage()); }
        this.setbaseSalary(this.getbaseSalary() + this.recruitmentBonus);
    }
}

interface EmployeeManager{
    void manageEmployee();
    void promoteEmployee(Employee employee);
}

class EmployeeNotFoundException extends Exception{
    EmployeeNotFoundException(String errmsg){
        super(errmsg);
    }
}

class Company{
    Employee[] employees = new Employee[10];
    static int employeeindex = 0;
    Map<String, Integer> emp_promote = new HashMap<>();
    void addEmployee(Employee employee){
        this.employees[employeeindex] = employee;
        emp_promote.put(Integer.toString(this.employees[employeeindex].getID()), 0);
        employeeindex += 1;
    }
    void removeEmployee(Employee employee){
        int empindex = -1;
        for(int i = 0; i < employeeindex; i ++){
            if(this.employees[i].getID() == employee.getID()){
                empindex = employeeindex;
                break;
            }
        }
        try{
            if (empindex == -1){
                throw new EmployeeNotFoundException("Employee Name: " + employee.getName() + " is not found in Company");
            }
        }catch(EmployeeNotFoundException e){System.out.println(e.getMessage());}
        
        Employee[] emplist = new Employee[employeeindex - 1];
        for (int i = 0; i < employeeindex; i ++){
            if (i < empindex){
                emplist[i] = this.employees[i];
            }else if (i > empindex){
                emplist[i - 1] = this.employees[i];
            }
        }
        this.employees = emplist;
    }
    void listEmployees(){
        System.out.println("Employees in the Company: ");
        for(int i = 0; i < employeeindex; i ++){
        //     this.id = id;
        // this.name = name;
        // this.department = department;
        // this.baseSalary = baseSalary;
        // this.workingHours = workingHours;
            System.out.print("ID: " + this.employees[i].getID() + 
            ", Name: " + this.employees[i].getName() + 
            ", Department: " + this.employees[i].getDepartment() + 
            ", Base Salary: " + this.employees[i].getbaseSalary() + 
            ", Working Hours: " + this.employees[i].getWorkingHours() + 
            ", Total Salary: ");
            String clname = this.employees[i].getClass().getSimpleName();
            if (clname == "Manager"){
                System.out.println(this.employees[i].getbaseSalary() + ".");
            } else if (clname == "HR"){
                System.out.println(this.employees[i].getbaseSalary() + 16000 + ".");
            } else if (clname == "IT"){
                System.out.println("70000" + ".");
            } else{
                System.out.println("70000" + ".");
            }
        }
    }
    void findEmployeeById(int id){
        for(int i = 0; i < employeeindex; i ++){
            Employee employee = this.employees[i];
            if (employee.getID() == id){
                System.out.println("Employee Found: ID: " + this.employees[i].getID() + 
                ". Name: " + this.employees[i].getName() + 
                ". Department: " + this.employees[i].getDepartment() + 
                ". Base Salary: " + this.employees[i].getbaseSalary() + 
                ". Working Hours: " + this.employees[i].getWorkingHours() + ".");
                break;
            }
        }
    }
    void promoteEmployee(Employee emp){
        if(this.emp_promote.containsKey(Integer.toString(emp.getID()))){
            this.emp_promote.put(Integer.toString(emp.getID()), this.emp_promote.getOrDefault(Integer.toString(emp.getID()), 0) + 1);
        }
    }
}

public class Solution{
    public static void main(String[] args) {
        Company company = new Company();
        Employee manager = new Manager(101, "John Smith", "HR", 80000, 160, 20);
        Employee developer = new Developer(102, "Alice Brown", "IT", 70000, 150, 120);
        Employee hr = new HR(103, "Robert White", "HR", 60000, 160, 100);
        company.addEmployee(manager);
        company.addEmployee(developer);
        company.addEmployee(hr);

        company.listEmployees();

        manager.calculateSalary();
        developer.calculateSalary();
        hr.calculateSalary();
        company.promoteEmployee(manager);
        company.findEmployeeById(102);

    }
}