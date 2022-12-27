package pro.sky.java.course2_0.course_work;

public class EmployeeBook {
    private static final int COUNT_DEPARTMENT = 5;
    private static final int EMPLOYEES_SIZE = 10;
    private final Employee[] employees = new Employee[EMPLOYEES_SIZE];

    public void printAllInformation() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public double calculateSalaryMonth() {
        double salaryEmployeesMonth = 0.0;
        for (Employee employee : employees) {
            if (employee != null) {
                salaryEmployeesMonth += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц - " + salaryEmployeesMonth);
        return salaryEmployeesMonth;
    }

    public Employee calculateSalaryMin() {
        double salaryMinEmployee = Double.MAX_VALUE;
        Employee tempEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salaryMinEmployee) {
                salaryMinEmployee = employee.getSalary();
                tempEmployee = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " + tempEmployee);
        return tempEmployee;
    }

    public Employee calculateSalaryMax() {
        double salaryMaxEmployee = 0.0;
        Employee tempEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > salaryMaxEmployee) {
                salaryMaxEmployee = employee.getSalary();
                tempEmployee = employee;
            }
        }
        System.out.println("Сотрудник с  максимальной зарплатой " + tempEmployee);
        return tempEmployee;
    }

    public double calculateSalaryMiddle() {
        int countEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                countEmployees++;
            }
        }
        double salaryMiddle = calculateSalaryMonth() / countEmployees;
        System.out.println("Cреднее значение зарплат " + salaryMiddle);
        return salaryMiddle;
    }

    public void printOnlyName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }

    public void calculateSalaryIndexation(int percent) {
        double salaryIndexation;
        for (Employee employee : employees) {
            if (employee != null) {
                salaryIndexation = employee.getSalary() * percent / 100;
                employee.setSalary(employee.getSalary() + salaryIndexation);
            }
        }
        System.out.println("Зарплата всех соотрудников увеличена на " + percent + " процента");
    }

    public void printEmployeesMoreSalaryThan(int salary) {
        System.out.println("Все сотрудники с зарплатой больше или равно " + salary);
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salary) {
                System.out.println(employee.toStringNoDepartment());
            }
        }
    }

    public Employee calculateSalaryMinDepartment(int department) {
        double salaryMinEmployee = Double.MAX_VALUE;
        Employee tempEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() < salaryMinEmployee) {
                salaryMinEmployee = employee.getSalary();
                tempEmployee = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - в отделе " + department + " " + tempEmployee);
        return tempEmployee;
    }

    public Employee calculateSalaryMaxDepartment(int department) {
        double salaryMaxEmployee = 0.0;
        Employee tempEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() > salaryMaxEmployee) {
                salaryMaxEmployee = employee.getSalary();
                tempEmployee = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - в отделе " + department + " " + tempEmployee);
        return tempEmployee;
    }

    public double salarySumEmployeesDepartment(int department) {
        double salarySumEmployee = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                salarySumEmployee += employee.getSalary();
            }
        }
        System.out.println("В отделе " + department + " Сумма зарплат состовляет " + salarySumEmployee);
        return salarySumEmployee;
    }

    public double calculateSalaryMiddleDepartment(int department) {
        int countEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                countEmployees++;
            }
        }
        double salaryMiddleDepartment = salarySumEmployeesDepartment(department) / countEmployees;
        System.out.println("В отделе " + department + " Средняя зарплата - " + salaryMiddleDepartment);
        return salaryMiddleDepartment;
    }

    public void calculatesalaryIndexationDepartment(int percent, int department) {
        double salaryIndexation;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                salaryIndexation = employee.getSalary() * percent / 100;
                employee.setSalary(employee.getSalary() + salaryIndexation);
            }
        }
        System.out.println("Зарплата всех соотрудников отдела " + department + " увеличена на " + percent + " процента");
    }

    public void printInformationDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.toStringNoDepartment());
            }
        }
    }

    public void printEmployeesLessSalaryThan(int salary) {
        System.out.println("Все сотрудники с зарплатой меньше " + salary);
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println(employee.toStringNoDepartment());
            }
        }
    }

    public void addNewEmployee(String name, double salary, int department) {
        if (isEmptyPlace() == 0) {
            System.out.println("Места для нового соотрудника отсутствует");
        } else {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    employees[i] = new Employee(name, salary, department);
                    return;
                }
            }
        }

    }

    private int isEmptyPlace() {
        int count = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                count++;
            }
        }
        return count;
    }

    public void deleteEmployee(String name) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName().equalsIgnoreCase(name)) {
                System.out.println("Соотрудник " + employees[i].toString() + " удален");
                employees[i] = null;
                return;
            }
        }
        System.out.println("Соотрудник " + name + " не найден");
    }

    public void deleteEmployee(int idEmployees) {
        boolean searchEmployees;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getIdEmployee() == idEmployees) {
                System.out.println("Соотрудник " + employees[i].toString() + " удален");
                employees[i] = null;
                return;
            }
        }
        System.out.println("Соотрудник  c ИД " + idEmployees + " не найден");
    }


    public void changeSalary(String name, double salary) {
        boolean searchEmployees;
        for (Employee employee : employees) {
            if (employee != null && employee.getName().equalsIgnoreCase(name)) {
                employee.setSalary(salary);
                System.out.println("Изменилать зарплата соотрудника " + employee);
                return;
            }
        }
        System.out.println("Соотрудник " + name + " не найден");
    }

    public void changeDepartment(String name, int department) {
        boolean searchEmployees;
        for (Employee employee : employees) {
            if (employee != null && employee.getName().equalsIgnoreCase(name)) {
                employee.setDepartment(department);
                System.out.println("Изменился отдел соотрудника " + employee);
                return;
            }
        }
        System.out.println("Соотрудник " + name + " не найден");
    }

    public void printEmployeesNameAllDepartment() {
        for (int i = 1; i <= COUNT_DEPARTMENT; i++) {
            System.out.println("Отдел " + i);
            for (Employee employee : employees) {
                if (employee != null && employee.getDepartment() == i) {
                    System.out.println(employee.getName());
                }
            }
        }
    }
}