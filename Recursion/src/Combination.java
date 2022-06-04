import java.util.Scanner;
public class Combination {

    public static int fact(int n){
        if(n>=1){
            return n*fact(n-1);
        }
        return 1;
    }

    public static int combination(int n,int r){
        return fact(n) / (fact(r) * fact(n-r));
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        System.out.println("Enter the value of r: ");
        int r = in.nextInt();
        System.out.print("The required combination is: " + combination(n,r));

    }
}
