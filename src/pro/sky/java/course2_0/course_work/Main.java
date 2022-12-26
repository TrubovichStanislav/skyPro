package pro.sky.java.course2_0.course_work;


public class Main {
    public static void main(String[] args) {
        int percent = 1;
        int department = 2;
        Employee[] employees = new Employee[10];
        Employee ivanovII = new Employee("Иванов Иван Иванович", 90_000, 1);
        Employee petrovPP = new Employee("Петров Петр Петрович", 30_000, 2);
        Employee sidorovSS = new Employee("Сидоров Сергей Сергеивич", 4.44, 2);
        Employee solovevAV = new Employee("Соловьев Антон Владимирович", 40_444, 1);
        employees[0] = ivanovII;
        employees[1] = petrovPP;
        employees[2] = sidorovSS;
        employees[3] = solovevAV;
        printAllInformationEmployees(employees);
        System.out.println("Сумма затрат на зарплаты в месяц - " + salaryAllEmployeesMonth(employees) + " рублей");
        System.out.println("Сотрудник с минимальной зарплатой - " + salaryMinEmployees(employees));
        System.out.println("Сотрудник с  максимальной зарплатой - " + salaryMaxEmployees(employees));
        System.out.println("Cреднее значение зарплат - " + salaryEmployeesMiddle(employees));
        printFullNameEmployees(employees);
        //salaryIndexation(employees,percent);
        System.out.println("Сотрудник с минимальной зарплатой - в переданном отделе " + salaryMinEmployeesDepartment(employees, department));
        System.out.println("Сотрудник с максимальной зарплатой - в переданном отделе " + salaryMaxEmployeesDepartment(employees, department));
        System.out.println("Сумму затрат на зарплату по отделу " + salarySumEmployeesDepartment(employees, department));
        System.out.println("Cреднее значение зарплат по отделу " + salaryEmployeesMiddleDepartment(employees, department));
        salaryIndexationDepartment(employees, percent, department);
        printAllInformationEmployees(employees);
        System.out.println("Все сотрудники с зарплатой меньше числа");
        printEmployeesLessSalaryThan(employees, 1000000);
        System.out.println("Все сотрудники с зарплатой ,больше   или равно числа");
        printEmployeesMoreSalaryThan(employees, 1);
    }

    public static void printAllInformationEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double salaryAllEmployeesMonth(Employee[] employees) {
        double salaryEmployeesMonth = 0.0;
        for (Employee employee : employees) {
            if (employee != null) {
                salaryEmployeesMonth += employee.getSalary();
            }
        }
        return salaryEmployeesMonth;
    }

    public static Employee salaryMinEmployees(Employee[] employees) {
        double salaryMinEmployee = Double.MAX_VALUE;
        System.out.println(salaryMinEmployee);
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
        double salaryMaxEmployee = 0.0;
        Employee tempEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > salaryMaxEmployee) {
                salaryMaxEmployee = employee.getSalary();
                tempEmployee = employee;
            }
        }
        return tempEmployee;
    }

    public static double salaryEmployeesMiddle(Employee[] employees) {
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

    public static void salaryIndexation(Employee[] employees, int percent) {
        double salaryIndexation;
        for (Employee employee : employees) {
            if (employee != null) {
                salaryIndexation = employee.getSalary() * percent / 100;
                employee.setSalary(employee.getSalary() + salaryIndexation);
            }
        }
    }

    public static Employee salaryMinEmployeesDepartment(Employee[] employees, int department) {
        double salaryMinEmployee = Double.MAX_VALUE;
        Employee tempEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() < salaryMinEmployee) {
                salaryMinEmployee = employee.getSalary();
                tempEmployee = employee;
            }
        }
        return tempEmployee;
    }

    public static Employee salaryMaxEmployeesDepartment(Employee[] employees, int department) {
        double salaryMaxEmployee = 0.0;
        Employee tempEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() > salaryMaxEmployee) {
                salaryMaxEmployee = employee.getSalary();
                tempEmployee = employee;
            }
        }
        return tempEmployee;
    }

    public static double salarySumEmployeesDepartment(Employee[] employees, int department) {
        double salarySumEmployee = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                salarySumEmployee += employee.getSalary();
            }
        }
        return salarySumEmployee;
    }

    public static double salaryEmployeesMiddleDepartment(Employee[] employees, int department) {
        int countEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                countEmployees++;
            }
        }
        return salarySumEmployeesDepartment(employees, department) / countEmployees;
    }

    public static void salaryIndexationDepartment(Employee[] employees, int percent, int department) {
        double salaryIndexation;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                salaryIndexation = employee.getSalary() * percent / 100;
                employee.setSalary(employee.getSalary() + salaryIndexation);
            }
        }
    }

    public static void printInformationEmployeesDepartment(Employee[] employees, int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.toStringNoDepartment());
            }
        }
    }

    public static void printEmployeesLessSalaryThan(Employee[] employees, int salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println(employee.toStringNoDepartment());
            }
        }
    }
    public static void printEmployeesMoreSalaryThan(Employee[] employees, int salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >=salary) {
                System.out.println(employee.toStringNoDepartment());
            }
        }
    }

}