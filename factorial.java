import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("is the factorial of entered num "+factorial(num));
    }
    static int factorial(int num){
        int mul = 1;
        if (num == 0){
            return 1;
        }
        for (int i =1;i<=num;i++){
            mul *= i;
        }
        return mul;
    }
}
