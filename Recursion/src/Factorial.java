import java.util.Scanner;
public class Factorial {

    public static  double fact(int n){
        if(n>=1){
            return n*fact(n-1);
        }
        return 1;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.printf("Factorial of %d is: %f",num, fact(num));
    }
}
