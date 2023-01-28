package pro.sky.java.course2_0.OOP_part1;

public class Mechanic {
    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public void maintenance() {
        System.out.println(name + " из компании " + company + " проводит тех обслуживание");
    }

    public void fixing(){
        System.out.println(name + " из компании " + company + " чинит автомобиль");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return name;
    }
}
