package singleInheritance;
// single inheritance
// a single child class inheritance the properties and methods of single parent class
// class Teacher is parent
// class PhysicsTeacher is child
public class Teacher {
    // fields of parent class
    String designation = "Teacher";
    String collegeName = "BeginnerJava";

    // method of parent class
    public void does() {
        System.out.println("Teaching");
    }
}