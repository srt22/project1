package singleInheritance;

public class ParameterisedMethod {
    // method = behaviour
//     variable (object) = state
    //   static int a = 50;
    //  static int b= 20;

    public    static           String    getMyMethod       (String stuFName, String stuLName, int stuAge) {
//  Access     Non-Access     return    Method             Parameter
// Modifier    Modifier       Type       Name
        String stuDetail = stuFName + " " + stuLName + " " + stuAge;
        return stuDetail;
    }

    public static void main(String[] args) {
//        int d= getMyMethod();
//        System.out.println(d);
//        String myStuData = getMyMethod("Swati", "Chothani", 22);
//        System.out.println(getMyMethod("Brijal", "Chothani", 22));
//        getMyMethod("Swati", "Tyagi", 25);
//        getMyMethod("Shital", "Dalal", 25);

    }
}
