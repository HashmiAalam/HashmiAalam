public class Test {
    //This is my first commit in IntelliJ
    int a=100;
    static int b=230;
    Test(){
        this(300);
        System.out.println("0-arg constructor");
    }
    Test(int a){
        System.out.println("1-arg constructor");
    }
    static {
        System.out.println("Static block");
    }
    {
        System.out.println("Instance block");
    }
    static void method1(){
        System.out.println("Hi static method I can use static variable which is "+b);
    }
    int method2(int a){
        System.out.println("Hi instance method with argument and return type and having local variable "+a);
        return this.a;
    }
    public static void main(String[] args) throws ClassNotFoundException{
        Test test=new Test();
        test.method1();
        int x=test.method2(30);
        System.out.println("This is instance variable "+x);
        new Test(10);
        Class.forName("Test1");
        Class.forName("A");

    }

}