package Streams;

public class Java8Demo {
    public static void main(String[] args) {
        Thread t1=new Thread(() ->{
            System.out.println("Hello");

        });


        MathOperation sumOperation=(a,b) -> a+b;
        MathOperation subtractOperation=(a,b) ->a-b;
        int res=sumOperation.operate(1,2);
        System.out.println(res);
    }
}
interface  MathOperation{
    int operate(int a,int b);
}
