import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your two num");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(sum(a,b)+" is the sum of two numbers");
    }
    static int sum(int a ,int b){
        int Sum = a + b;
        return Sum;
    }
}
