

public class p2_multilevel {

    static class Animal{
        void eat(){
            System.out.println("Eating");
        }
    }

    static class Dog extends Animal{
        void bark(){
            System.out.println("Barking");
        }
    }

    static class BabyDog extends Dog{
        void weep(){
            System.out.println("Weeping");
        }
    }

    public static void main(String[] args) {
        // Dog d = new Dog();
        // d.eat();
        // d.bark();
        BabyDog bd = new BabyDog();
        bd.eat();
        bd.bark();
        bd.weep();

    }
    
}
