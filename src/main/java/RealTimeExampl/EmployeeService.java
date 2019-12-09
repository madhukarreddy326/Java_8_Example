package main.java.RealTimeExampl;

import java.util.List;
import java.util.stream.Collectors;

/**
 * EmployeeService
 */
public class EmployeeService {

    public static List<Employee> processTaxEmployees(String inputValue)
    {
        return (inputValue.equalsIgnoreCase("tax"))?Dao.returnListOfEmployees().stream().filter(emp ->emp.getSal() <=5000).collect(Collectors.toList()):Dao.returnListOfEmployees().stream().filter(emp ->emp.getSal() >5000).collect(Collectors.toList());
    }

    public static void main(String args[])
    {
        System.out.println("The values are :"+processTaxEmployees("tax"));
    }
}