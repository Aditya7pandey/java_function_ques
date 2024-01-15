import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("the summation of your terms upto "+num+" is "+ summation(num));
    }
    static int summation(int num){
        int sum = 0;
        for (int i = 0;i<= num;i++){
            sum += i;
        }
        return sum;
    }
}
