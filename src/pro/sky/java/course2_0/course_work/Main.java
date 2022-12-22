package pro.sky.java.course2_0.course_work;



public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Employee ivanovII = new Employee("Иванов Иван Иванович", 50_000, 1);
        Employee petrovPP = new Employee("Петров Петр Петрович", 60_000, 2);
        employees[0] = ivanovII;
        employees[1] = petrovPP;
        printAllInformationEmployees(employees);
        System.out.println("Сумма затрат на зарплаты в месяц - " + salaryAllEmployeesMonth(employees) + " рублей");
        System.out.println("Сотрудник с минимальной зарплатой - " + salaryMinEmployees(employees));
        System.out.println("Сотрудник с  максимальной зарплатой - " + salaryMaxEmployees(employees));
        System.out.println("Cреднее значение зарплат - " + salaryEmployeesMiddle(employees));
        printFullNameEmployees(employees);
    }

    public static void printAllInformationEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static int salaryAllEmployeesMonth(Employee[] employees) {
        int salaryEmployeesMonth = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                salaryEmployeesMonth += employee.getSalary();
            }
        }
        return salaryEmployeesMonth;
    }

    public static Employee salaryMinEmployees(Employee[] employees) {
        int salaryMinEmployee = Integer.MAX_VALUE;
        Employee tempEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salaryMinEmployee) {
                salaryMinEmployee = employee.getSalary();
                tempEmployee = employee;
            }
        }
        return tempEmployee;

    }

    public static Employee salaryMaxEmployees(Employee[] employees) {
        int salaryMaxEmployee = 0;
        Employee tempEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > salaryMaxEmployee) {
                salaryMaxEmployee = employee.getSalary();
                tempEmployee = employee;
            }
        }
        return tempEmployee;
    }

    public static int salaryEmployeesMiddle(Employee[] employees) {
        int countEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                countEmployees++;
            }
        }
        return salaryAllEmployeesMonth(employees) / countEmployees;
    }

    public static void printFullNameEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }
}