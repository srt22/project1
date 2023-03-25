package singleInheritance;
// single inheritance

public class PhysicsTeacher extends Teacher {
    // field of child class
    String mainSubject = "physics";
    public static void main(String[] args) {
    PhysicsTeacher obj = new PhysicsTeacher(); // object
    // accessing the fields of parent class

        System.out.println(obj.mainSubject);
        // accessing the field of parent class
        System.out.println(obj.collegeName);
        // accessing the method of parent class
        System.out.println(obj.designation);
        obj.does();
    }
}
