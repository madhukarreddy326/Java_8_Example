package RealTimeExampl;//package main.java.RealTimeExampl;

import java.util.List;
import java.util.stream.Collectors;

/**
 * EmployeeService
 */
public class EmployeeService {

    public static List<RealTimeExampl.Employee> processTaxEmployees(String inputValue)
    {
        return (inputValue.equalsIgnoreCase("tax"))? RealTimeExampl.Dao.returnListOfEmployees().stream().filter(emp ->emp.getSal() <=5000).collect(Collectors.toList()): RealTimeExampl.Dao.returnListOfEmployees().stream().filter(emp ->emp.getSal() >5000).collect(Collectors.toList());
    }

    public static void main(String args[])
    {
        System.out.println("The values are :"+processTaxEmployees("tax"));
    }
}