//if there was no constructor what problems can occur
public class p1 {

    static class employee{
        String name;
        int empid;
    }

    public static void main(String[] args) {
        employee e1 = new employee();
        employee e2 = new employee();
        e1.name = "John";
        e1.empid = 101;
        System.out.println("Employee name: "+e1.name+" and Employee ID: "+e1.empid);
    }
    
}
