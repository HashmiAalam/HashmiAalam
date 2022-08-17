public class WorkingWithJava1 {
    static int variable1=90;
    static int variable2=80;
    static int method1(int a){
        int variable3=12;
        int variable4=34;
       // int sum=variable4+variable3;
        return variable4+variable3;
    }
    public static void main(String[] args){
        WorkingWithJava1 workingWithJava1=new WorkingWithJava1();
        workingWithJava1.method1(variable1);
    }
}
