public class p2_referenceVar {

    static class Animal{
        String color;
        int age;
    }

    public static void main(String args[]){
        Animal zuzu = new Animal();
        zuzu.color = "Black";
        zuzu.age = 5;
        System.out.println("Zuzu is a "+zuzu.color+" dog and is "+zuzu.age+" years old.");
    }
    
}

//initialization of obj by reference variable


