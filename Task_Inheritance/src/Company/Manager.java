package Company;

public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, String department, double salary, int teamSize) {
        super(name, department, salary);
        this.teamSize = teamSize;
    }

    // Getter and setter for teamSize

    @Override
    public String toString() {
        return super.toString() + ", Team Size: " + teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

}
