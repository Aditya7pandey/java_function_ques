import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        check(num);
    }
    static void check(int num){
        if (num<=100 && num>=91){
            System.out.println("AA");
        }
        if (num<=90 && num>=81){
            System.out.println("AB");
        }
        if (num<=80 && num>=71){
            System.out.println("BB");
        }
        if (num<=70 && num>=61){
            System.out.println("BC");
        }
        if (num<=60 && num>=51){
            System.out.println("CD");
        }
        if (num<=50 && num>=41){
            System.out.println("DD");
        }
        if (num<=40){
            System.out.println("FAIL");
        }
    }
}


//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail