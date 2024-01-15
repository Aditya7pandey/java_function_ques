import java.util.Scanner;

public class five {public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter your two num");
    int a = in.nextInt();
    int b = in.nextInt();
    System.out.println(mul(a,b)+" is the multiplication of two numbers");
}
    static int mul(int a ,int b){
        int Mul = a * b;
        return Mul;
    }
}



