
public class variables {

    class A{
        int a = 10;    //a - instance variable
        static int b=20; //b - static variable
        void add(){
            int c = 30;     //c - local variable
            int d=a+b+c;
            System.out.println("Sum: "+d);
        }

        void mul(){
            int e = 30,d;
            d=a*b*e;            //we cant use c here
            System.out.println("Product: "+d); 
        }


        void display(){
            System.out.println("A: "+a);
        }
    }
    
}
