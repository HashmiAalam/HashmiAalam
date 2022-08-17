import java.io.FileInputStream;

public class WorkingWithJava {
     int variable1=10;
     int variable2=20;
    String variable3="MyNameIsProgrammer";
     void method1(){
        System.out.println("I want to add int variables with java program because "+variable3);
        int sum=variable1+variable2;
        System.out.println("Addition of tow nos: "+sum);
    }
    public static void main(String[] args){
        new WorkingWithJava().method1();
    }
}
