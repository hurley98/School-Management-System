package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Lizzy = new Teacher(1,"Lizzy",500);
        Teacher Melissa = new Teacher(2,"Melissa",700);
        Teacher Rob = new Teacher(3,"Rob",600);

        List<Teacher> teacherList = new ArrayList<Teacher>();
        teacherList.add(Lizzy);
        teacherList.add(Melissa);
        teacherList.add(Rob);

        Student Steve = new Student(1,"Steve",7);
        Student Mike = new Student(2,"Mike",6);
        Student Jane = new Student(3,"Jane",10);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(Steve);
        studentList.add(Mike);
        studentList.add(Jane);

        School school = new School(teacherList,studentList);

        Teacher Megan = new Teacher(4, "Megan", 800);
        school.addTeacher(Megan);

        Steve.payFees(5000);
        Mike.payFees(400);
        System.out.println("Our school has earned $" + school.getTotalMoneyEarned());

        System.out.println("------------- School pays salaries ----------------");
        Lizzy.receiveSalary(Lizzy.getSalary());
        System.out.println("School has spent for salary to " + Lizzy.getName()
         + " and now has $" + school.getTotalMoneyEarned());

        Rob.receiveSalary(Rob.getSalary());
        System.out.println("School has spent for salary to " + Rob.getName()
                + " and now has $" + school.getTotalMoneyEarned());

        System.out.println(Steve);
        System.out.println(Lizzy);

    }
}
