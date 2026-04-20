import java.util.*;
public class Report {
    static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int sum=0;
        System.out.println("Enter 5 subject marks:");
        for (int i=0;i<5;i++){
            sum +=sc.nextInt();
        }
        double avg = sum/5.0;
        char grade;
        if(avg>=75) grade ='A';
        else if(avg>=60) grade ='B';
        else grade='C';
        System.out.println("Average: " +avg);
        System.out.println("Grade: " + grade);
    }
}
