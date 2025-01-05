

public class var2 {
    static class abc{
        int a = 10;    
        static int b=20; 
    }

    public static void main(String[] args) {
        abc obj = new abc();
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.a=1000;
        obj.b=2000;
        System.out.println(obj.a);
        System.out.println(obj.b);


        abc obj2 = new abc();
        System.out.println(obj2.a); // a is instance variable, value is initialized again as soon as obj2 created. so a new memory allocated
        System.out.println(obj2.b); // b is static variable, so it is shared among all objects of class abc, no new memory allocated
    }
}
