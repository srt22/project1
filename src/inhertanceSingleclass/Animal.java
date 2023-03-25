package inhertanceSingleclass;
// single inheritance class.
/* here Animal is a parent class of
 Cat would be a child class of Animal.
 */
public class Animal {
    // class cat extend only one class which is Animal class.
    private boolean vegetarian;private String eats;private int noOfLegs;
    public Animal(){}
    public Animal (boolean veg, String food, int legs){
        //this keyword can be used to refer current class instance variable.
        /* The super keyword refers to superclass(Parent) objects.
        it is used to call superclass method,
        and to access the superclass constructor.
        "This" in java is used to refer to methods,
        static and instance variable, constructors of a current class.*/
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
    }public boolean isVegetarian() {
        return vegetarian;
    }
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    public String getEats() {
        return eats;
    }public int getNoOfLegs() {
        return noOfLegs;
    }
    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}