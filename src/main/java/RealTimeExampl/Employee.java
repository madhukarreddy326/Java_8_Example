package main.java.RealTimeExampl;

/**
 * Employee
 */
public class Employee {

    private int id;
    private String name,dept;
    private long sal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public long getSal() {
        return sal;
    }

    public void setSal(long sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee [dept=" + dept + ", id=" + id + ", name=" + name + ", sal=" + sal + "]";
    }

    public Employee(int id, String name, String dept, long sal) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    } 
    

}