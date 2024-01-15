import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        check(num);
    }
    static void check(int num){
        if(num%2 == 0){
            System.out.println("its even");
        }
        else{
            System.out.println("its odd");
        }
    }
}
