package pro.sky.java.course2_0.course_work;

public class Employee {

    private String name;
    private int salary;
    private int department;
    private int idEmployee;
    private static int id = 1;


    public Employee(String name, int salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.idEmployee = id;
        id++;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "{" +
                "ФИО='" + name + '\'' +
                ", Зарплата=" + salary +
                ", Отдел=" + department +
                ", ИД=" + idEmployee +
                '}';
    }
}



