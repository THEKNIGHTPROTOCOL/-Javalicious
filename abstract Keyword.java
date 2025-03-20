// Java Program to implement
// Abstract Keywords

// Parent Class
abstract class gfg {
    abstract void printInfo();
}

// Child Class
class employee extends gfg {
    void printInfo()
    {
        String name = "aakanksha";
        int age = 21;
        float salary = 55552.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

// Driver Class
class base {
    // main function
    public static void main(String args[])
    {
        // object created
        gfg s = new employee();
        s.printInfo();
    }
}
