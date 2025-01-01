public class p4_parametrized {
    

    static class Employee{
        String name;
        int empid;

        Employee(String n, int id){
            this.name = n;
            this.empid = id;
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("John", 101);    //initializing objects properly so that they respond properly 
        Employee e2 = new Employee("Doe", 102);
        System.out.println("Employee name: "+e1.name+" and Employee ID: "+e1.empid);
        System.out.println("Employee name: "+e2.name+" and Employee ID: "+e2.empid);
    }
}
