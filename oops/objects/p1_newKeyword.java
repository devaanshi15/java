class p1_newKeyword
{
    static class Animal {
        public void run() {
            System.out.println("Animal is running");
        }

        public void eat() {
            System.out.println("Animal is eating");
        }
    }

    static class Birds {
        public void fly() {
            System.out.println("Birds are flying");
        }

        public void eat() {
            System.out.println("Birds are eating");
        }
    }

    public static void main(String args[]) {
        Animal a = new Animal(); // Creating Animal object
        a.run();
        a.eat();

        Birds b = new Birds(); // Creating Birds object
        b.fly();
        b.eat();
    }
}
