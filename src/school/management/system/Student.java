package school.management.system;
//keep track of student fees, name, garde and fees paid
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade){
        feesPaid = 0;
        feesTotal = 30_000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    public void setGrade(int grade){ this.grade = grade; }
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "\nStudent`s name: " + name +
                " \nTotal fees paid: $" + feesPaid + "\n";
    }
}
