// if we have abstract method in class then class should also be abstract
abstract class Car {
    // abstract is used to define a method in super class and this method should 
    // defined in the sub class
    public abstract void drive();

    public void playMusic() {
        System.out.println("Playing Music");
    }
}

class I10 extends Car {     // concrete class
    // we have to define the abstract class in subclass
    public void drive() {
        System.out.println("Driving");
    }
    // if superclass have more abstract method but not defined in this class then this class then
    // we have to make this class also as abstract and make another subclass to define 
    // remaining method 
}


// abstract class can have only normal methods also 
public class AbstractKeyword {
    public static void main (String args[]) {
        // Cannot create object of abstract class
        // Car obj = new Car();
        // Can create ref of abstract class just like super class and assing object of subclass
        Car obj = new I10();    
        // I10 obj = new I10();
        obj.drive();
        obj.playMusic();
    }
}
