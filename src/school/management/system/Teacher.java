package school.management.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        salaryEarned = 0;
    }

    public String getName(){ return name; }
    public int getID(){ return id; }
    public int getSalary() { return salary; }

    public void setSalary(int salary){ this.salary = salary; }

    //adds to salary,removes from money earned by school
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "\nName of the Teacher is: " + name +
                "\nTotal salary earned so far: $" + salaryEarned + "\n";
    }
}
