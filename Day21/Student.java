import java.util.*;
class Student
{
int id;
String course;
Student(int id ,String course)
{
this.id=id;
this.course=course;
}
void display()
{
System.out.println("Student id:" +id);
System.out.println("Student course:" +course);
}
public static void main(String args[])
{
Student s1=new Student(101,"Software engineering");
Student s2=new Student(102,"Computer Science");
s1.display();
s2.display();
}
}
