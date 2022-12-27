package pro.sky.java.course2_0.course_work;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addNewEmployee("Иванов Иван Иванович", 80_000, 1);
        employeeBook.addNewEmployee("Сидоров Сергей Сергеивич", 40_000, 1);
        employeeBook.addNewEmployee("Петров Петр Петрович", 70_000, 2);
        employeeBook.addNewEmployee("Соловьев Антон Владимирович", 90_000, 3);
        employeeBook.addNewEmployee("Коржаков  Виктор Игоревич", 120_000, 4);
        //тестирование методов

        // методы базовой сложности
        employeeBook.printAllInformation();
        employeeBook.calculateSalaryMonth();
        employeeBook.calculateSalaryMin();
        employeeBook.calculateSalaryMax();
        employeeBook.calculateSalaryMiddle();
        employeeBook.printOnlyName();

        // методы повышенной сложности
        employeeBook.calculateSalaryIndexation(3);
        employeeBook.calculateSalaryMinDepartment(1);
        employeeBook.calculateSalaryMaxDepartment(1);
        employeeBook.calculateSalaryMiddleDepartment(1);
        employeeBook.calculatesalaryIndexationDepartment(5, 1);
        employeeBook.printInformationDepartment(1);
        employeeBook.printEmployeesLessSalaryThan(100_000);
        employeeBook.printEmployeesMoreSalaryThan(70_000);

        // методы повышенной сложности
        employeeBook.addNewEmployee("Борисюк Илья Олегович", 80_000, 4);
        employeeBook.deleteEmployee("Борисюк Илья Олегови");
        employeeBook.deleteEmployee(6);
        employeeBook.changeSalary("соловьев антон владимирович", 90_000);
        employeeBook.changeDepartment("соловьев антон владимирович", 1);
        employeeBook.printEmployeesNameAllDepartment();

    }
}