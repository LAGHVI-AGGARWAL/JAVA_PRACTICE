
import java.util.*;
class Person{
    public String name;
    public String address;
    public int age;
}
class Student extends Person{
    public int marks;
    public String grade;
    
    Student(String name, String address, int age, int marks, String grade){
        this.name = name;
        this.address = address;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }
    
    public void disp(){
        System.out.println("Name is " + name);
        System.out.println("address is " + address);
        System.out.println("age is " + age);
        System.out.println("marks is " + marks);
        System.out.println("grade is " + grade);
    }
}


public class Main
{
	public static void main(String[] args) {
	    Student student = new Student("laghvi","MI",21,95,"A+");
	    
	    student.disp();
	}
}
