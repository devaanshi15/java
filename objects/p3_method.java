//by using method object is being initialized

public class p3_method {

    static class Animal {
        String color;
        int age;

        void initObj(String c, int a) {
            color = c; 
            // c and a are initialized inside the instance variable of the class i.e, color and age
            age = a;
        }

        void display() {
            System.out.println("Zuzu is a " + color + " dog and is " + age + " years old.");
        }
    }

    public static void main(String args[]) {
        Animal zuzu = new Animal();
        zuzu.initObj("Black", 5);
        zuzu.display();
    }

}
