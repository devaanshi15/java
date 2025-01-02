

public class p3_hirarchical {
    static class A{
        void method1(){
            System.out.println("Method 1");
        }
    }

    static class B extends A{
        void method2(){
            System.out.println("Method 2");
        }
    }

    static class C extends A{
        void method3(){
            System.out.println("Method 3");
        }
    }

    public static void main(String[] args) {
        B b = new B();
        b.method1();
        b.method2();
        C c = new C();
        c.method1();
        c.method3();
    }
}
