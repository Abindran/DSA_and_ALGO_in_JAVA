import java.util.Scanner;
public class Power {

    public static int power(int b,int e){
        if(e==0){
            return 1;
        }else{
            return b*power(b,e-1);
        }

    }

    public static void main(String[] args){
        System.out.println("Enter the value of base: ");
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        System.out.println("Enter the value of exponent: ");
        int e = input.nextInt();
        System.out.println("The Result is: " + power(b,e));
    }
}
