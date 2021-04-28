import java.util.Scanner;

public class ExponentialCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter base number");
        double x = keyboard.nextDouble();
        System.out.println("enter exponent number");
        int n = keyboard.nextInt();
        System.out.println(x + " to the power " + n + " is: " + pow(x,n));

    }

    public static double pow(double x, int n) {
        if(n == 0)
            return 1;
        if(n<0){
            n = -n;
            x = 1/x;
        }
        return (n%2 == 0) ? pow(x*x, n/2) : x*pow(x*x, n/2);
    }
}
