import java.util.Scanner;

public class pythogoreonTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        check(a,b,c);
    }
    static void check(int a ,int b,int c){
        int k = (a*a)+(b*b);
        if (k == (c*c)){
            System.out.println("its a pythogorus triplet");
        }
        else{
            System.out.println("its not a pythogorus triplet");
        }
    }
}
