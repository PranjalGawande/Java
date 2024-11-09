class Human {
    private int age;
    private String name;

    // Constructor
    // if constructor is not defined then a blank constructor auto defined (check .class file)
    // Human {

    // }
    // Default Constructor
    public Human() {    // called when the object is created
        // System.out.println("in constructor");
        // Assigning default values
        age = 30;       
        name = "Hari";
    }

    // Parameterized Constructor
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int var1) {
        this.age = var1;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }
}

public class Constructors {
    public static void main(String args[]) {
        Human obj = new Human();
        Human obj1 = new Human(24, "Pranjal");
        
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}
