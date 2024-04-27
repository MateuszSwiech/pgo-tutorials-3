import java.util.ArrayList;
import java.util.Calendar;

public class Manager extends Employee {
    private ArrayList<Goal> goals;



    public Manager(String fname, String lname, String address, String email, String pesel, int employmentYear) {
        super(fname, lname, address, email, pesel, employmentYear);
        this.goals = new ArrayList<>();
    }

    // Metoda do dodawania celów
    public void addGoals(Goal goal) {
        this.goals.add(goal);
    }

    // Nadpisana metoda calculateSalary z klasy bazowej Employee
    
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();  // Wywołanie metody z klasy bazowej
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // Miesiące są liczone od 0

        for (Goal goal : goals) {
            if (goal.isAchieved(currentYear, currentMonth)) {
                baseSalary += goal.getBonus();
            }
        }

        return baseSalary;
    }
}
