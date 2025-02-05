package Oops.Encapsulation;

class Encapsu{
    //private data
    private String name;
    private int age;
    private double salary;

    //    getter method for the name
    public String getName(){
        return name;
    }
    //setter function for name
    public void setName(String name){
        this.name=name;
    }
    //    getter function for age
    public int getAge(){
        return age;
    }
    //setter function for age
    public void setAge(int age){
        this.age=age;
    }
    //getter function for salary
    public double getSalary(){
        return salary;
    }
    //    setter function for salary
    public void setSalary(double salary){
        this.salary=salary;
    }
}
public class AboutEncapsulation {
    public static void main(String[] args) {
        //object of the class
        Encapsu emp = new Encapsu();
        //setting the values of the variable using the setter
        emp.setName("sunny");
        emp.setAge(23);
        emp.setSalary(75000);
//        getting the values using the setter function
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: Rs" + emp.getSalary());
    }
}
