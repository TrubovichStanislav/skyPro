package pro.sky.java.course2_0.course_work;

import java.util.Objects;

public class Employee {

    private String name;
    private double salary;
    private int department;
    private int idEmployee;
    private static int id = 1;


    public Employee(String name, double salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.idEmployee = id;
        id++;
        System.out.println( "Добавлен новый соотрудник " + this.toString());
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setSalary(double salary) {
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


    public String toStringNoDepartment() {
        return "{" +
                "ФИО='" + name + '\'' +
                ", Зарплата=" + salary +
                ", ИД=" + idEmployee +
                '}';
    }


}



