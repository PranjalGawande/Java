class Human {
    // Make data members as private so that object cant access data directly
    private int age;
    private String name;
    
    // Getter and Setter to access and modify the data
    public int getAge() {
        return age;
    }

    // if we don't use this keyword we have to pass obj itself
    // public void setAge(int age, Human obj) {
    //     obj.age = age;     
    // }

    // this keyword represents the instance of current object which called the method
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



}

public class Encapsulation {
    public static void main (String args[]) {
        Human obj = new Human();
        // obj.setAge(24, obj);
        obj.setAge(24);
        obj.setName("Pranjal");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
