import java.io.IOException;

public class Calculator {

    public static void main (String[] args) throws IOException {
        System.out.println(plus(25,25));
        System.out.println(minus(25,25));
        System.out.println(multiply(25,25));
        int GG = System.in.read();
        System.out.println(GG);
    }

    public static int plus(int x, int y){
        return x+y;
    }
    public static int minus(int x, int y){
        return x-y;
    }
    public static int multiply(int x, int y){
        return x*y;
    }
}
