/* (b) Aim: Create a program to use lambda expressions and stream operations to filter students 
scoring above 75%, sort them by marks, and display their names.*/


//Code:
import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - Marks: " + marks;
    }
}

public class StudentFilter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 85),
            new Student("Bob", 72),
            new Student("Charlie", 90),
            new Student("David", 78)
        );

        List<Student> filteredStudents = students.stream()
            .filter(s -> s.marks > 75)
            .sorted(Comparator.comparingDouble(s -> -s.marks))
            .collect(Collectors.toList());

        filteredStudents.forEach(System.out::println);
    }
}



/* (a) Aim: To write a program to sort a list of Employee objects (name, age, salary) using lambda 
expressions. 
*/

/*
Code: 
import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - Age: " + age + ", Salary: $" + salary;
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 30, 50000),
            new Employee("Bob", 25, 60000),
            new Employee("Charlie", 35, 55000)
        );

        employees.sort(Comparator.comparingDouble(e -> e.salary));
        employees.forEach(System.out::println);
    }
}


*/


