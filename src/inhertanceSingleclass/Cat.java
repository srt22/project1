package inhertanceSingleclass;
// cat class that inherits from Animal class.
// extends the Animal class.
/*extends keyword is used for inheritance in java.using the extends indicates you are derived
from an existing class.words,"extends" refers increased functionality.
*/
public class Cat extends Animal {
    // method and fields
    /*A variable define in a class is called a field.
    Declare a " field " for the primitive data types, object,and collection ADD static ,
     and access modifiers to fields 2. */
    private String colour;
    public Cat(boolean veg, String food, int legs){
        /* The "super" keyword refers to superclass(Parent) objects.
        it is used to call superclass method,
        and to access the superclass constructor.
        "This" in java is used to refer to methods,
        static and instance variable, constructors of a current class.*/
        super(veg, food, legs);
        this.colour = "Black";
    }public String getColour() {
        return colour;
    }public void setColour(String colour) {
        this.colour = colour;
    }
    public static void main(String[] args) {
        Cat cat = new Cat (false,"milk : ",4);
        System.out.println("Cat is vegetarian ?: " + cat.isVegetarian());
        System.out.println("Cat drink : " + cat.getEats());
        System.out.println("Cat has : " + cat.getNoOfLegs() + " legs");
        System.out.println("Cat colour is : " + cat.getColour());
        // calling the methods
    }
}
