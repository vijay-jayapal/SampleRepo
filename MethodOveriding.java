
import java.io.*;
import java.util.*;
class Person{
    String name;
    int age;
    
    public Person(String name,int age){
        this.name = name;
         this.age = age;
    }
    
    void print(){
        System.out.println("Name:"+this.name+"\nAge:"+this.age);
    }
}

class Student extends Person{
    int studentId;
    String courseName;
    
     public Student(String name,int age,int studentId,String courseName){
        super(name,age);
        this.studentId = studentId;
        this.courseName = courseName;
    }
    
    void print(){
        System.out.println("Name:"+this.name+"\nAge:"+this.age+"\nStudentID:"+studentId+"\ncourseName"+courseName);
    }
}

class Staff extends Person{
    
    int salary;
    String subjectName;
    
     public Staff(String name,int age,int salary,String subjectName){
        super(name,age);
        this.salary = salary;
        this.subjectName = subjectName;
    }
    
    void print(){
        System.out.println("Name:"+this.name+"\nAge:"+this.age+"\nStudentID:"+salary+"\nsubjectName"+subjectName);
    }
}
public class  MethodOveriding{
    public static void main(String[] args) {
        
        Person obj = new Person("John",25);
        obj.print();
        
        Person obj1 = new Staff("lipin",45,50000,"JAVA");
        obj1.print();
        
        Person obj2 = new Student("Hamen",18,12345,"MCA");
        obj2.print();
    }
}