import java.lang.Thread;

public class A2 extends Thread{

    public static int  a(int c){
        if(c==1){
            return 1;
        }
        return c+a(c-1);
    }
    public static void main(String arg[]) {
        System.out.println(a(5));
    }
}
