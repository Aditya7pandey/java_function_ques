import java.util.Scanner;

public class PrimeNumBw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        prime(a,b);
    }
    static void prime(int a ,int b){
        for (int i = a;i<b;i++){
            int count = 0;
            for(int j=1;j<=i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(i);
            }
        }
    }
}
