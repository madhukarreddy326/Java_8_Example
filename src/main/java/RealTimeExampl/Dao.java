package main.java.RealTimeExampl;

import java.util.ArrayList;
import java.util.List;

/**
 * Dao
 */
public class Dao {

    public static List<Employee> returnListOfEmployees()
    {
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(123,"madhukar","sella",5000));
        employee.add(new Employee(234,"venkat","sella",6000));
        employee.add(new Employee(897,"Vel","athena",8888));
        employee.add(new Employee(765,"Vijay","sella",6768));

        return employee;
        
    }
}