public class Employee {
    private String fname;
    private String lname;
    private String email;
    private String address;
    private String pesel ;
    private int EmploymentYear;
    public Employee(String fname, String lname, String address, String email, String pesel, int EmploymentYear) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.EmploymentYear = EmploymentYear;
    }
    public int calculateSalary(){
        int workedYears=2024-EmploymentYear;
        int salary=3000+1000*workedYears;
        return salary;
    }

}
