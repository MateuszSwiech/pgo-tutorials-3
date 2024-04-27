import java.util.ArrayList;

public class Tester extends Employee {
    private ArrayList<String> testTypes;

    public Tester(String fname, String lname, String address, String email, String pesel, int EmploymentYear) {
        super(fname, lname, address, email, pesel, EmploymentYear);
        this.testTypes = new ArrayList<>();
    }

    public void addTestType(String testType) {
        testTypes.add(testType);
    }

    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        baseSalary += testTypes.size() * 300;
        return baseSalary;
    }
}