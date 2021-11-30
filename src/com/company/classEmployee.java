

package com.company;
class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
     name=n;
    }
}
public class classEmployee {
    public static void main(String[] args) {
        Employee mayur= new Employee();
        mayur.setName("my name is mayur");
        System.out.println(mayur.getName());
        mayur.salary=25;
        System.out.println(mayur.getSalary());
    }
}
