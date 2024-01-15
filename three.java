import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        check(age);
    }
    static void check(int age){
        if (age>18){
            System.out.println("you are eligible");
        }
        else{
            System.out.println("you are not eligible");
        }
    }
}
