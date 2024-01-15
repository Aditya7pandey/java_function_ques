import java.util.Scanner;

public class palindromeorNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        check(num);
    }
    static void check(int num){
        int orignal = num;
        int sum = 0;
        while(num != 0 ){
            int x = num % 10;
            sum *= 10;
            sum += x;
            num /= 10;
        }
        if (sum == orignal){
            System.out.println("its palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
