import java.util.*;
public class TempConvert {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int ch = sc.nextInt();
        if (ch == 1) {
            System.out.println("Enter Celsius: ");
            double f= sc.nextDouble();
            double c= (f - 32) *5/9;
            System.out.println("Celsius: " +c);
        }
    }
}
