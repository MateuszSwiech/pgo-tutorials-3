import java.util.ArrayList;

public class Developer extends Employee {
    private ArrayList<Technology> technologies;

    public Developer(String fname, String lname, String address, String email, String pesel, int EmploymentYear) {
        super(fname, lname, address, email, pesel, EmploymentYear);
        this.technologies = new ArrayList<>();
    }

    public void addTechnology(Technology technology) {
        technologies.add(technology);
    }

    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        for (Technology technology : technologies) {
            baseSalary += technology.getBonus();
        }
        return baseSalary;
    }
}
