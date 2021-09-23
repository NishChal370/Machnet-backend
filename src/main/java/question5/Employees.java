package question5;
/*
* Question 5
* */
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Employees {
    int age;
    int salary;
    String name;
    String gender;
    String department;

    public Employees(String name, int age, String gender, String department, int salary){
        this.age=age;
        this.name=name;
        this.gender=gender;
        this.salary=salary;
        this.department=department;
    }

    public String getDepartment(){
        return this.department;
    }

    public Integer getSalary() {
        return this.salary;
    }

    public static Integer employeesAverageSalary(List<Integer> salary){
        int totalSalary = salary.stream().reduce(0, (acc, e) -> acc + e);
        return  totalSalary/salary.size();
    }

    public static void main(String[] args) {
        List<Employees> employeesList = new ArrayList<>();
        employeesList.add(new Employees("Nischal", 20, "male", "IT", 50000));
        employeesList.add(new Employees("Krishna", 37, "male", "IT", 70000));
        employeesList.add(new Employees("Ajay", 30, "male", "Production", 40000));
        employeesList.add(new Employees("Summit", 21, "male", "Purchasing", 90000));
        employeesList.add(new Employees("Dharma", 21, "male", "Production", 200000));
        employeesList.add(new Employees("Sita", 32, "female", "Human Resource Management", 500000));

        List<Integer> salariesList = employeesList.stream()
                .map(e->e.salary)
                .collect(Collectors.toList());

        System.out.println("Average salary of employees is:  "+ employeesAverageSalary(salariesList));


        Set<String> department = employeesList.stream()
                .map(e->e.department)
                .collect(Collectors.toSet());

        System.out.println("Unique Department: "+department);


        Map<String, Double> departmentsWithAverageSalary = employeesList.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment, Collectors.averagingInt(Employees::getSalary)));

        System.out.println("Average salary of the department: "+departmentsWithAverageSalary);
    }
}

