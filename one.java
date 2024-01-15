import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your 3 digits");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        System.out.println(Greatest(num1,num2,num3)+" is your greatest number" +
                "and"+Lowest(num1,num2,num3)+" is your lowest number");
    }
    static int Greatest(int num1,int num2,int num3){
        int greatest= num1;
        if(num2>greatest){
            greatest = num2;
        }
        if(num3>greatest){
            greatest = num3;
        }
        return greatest;
    }

    static int Lowest(int num1,int num2,int num3){
        int lowest= num1;
        if(num2<lowest){
            lowest = num2;
        }
        if(num3<lowest){
            lowest = num3;
        }
        return lowest;
    }
}
