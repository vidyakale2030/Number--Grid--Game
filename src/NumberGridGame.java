import java.util.*;
public class NumberGridGame {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][] = new int [3][3];
        System.out.println("Enter 9 Elements:");
        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++)
                arr[i][j]=sc.nextInt();
        System.out.println("Enter number to search: ");
        int num=sc.nextInt();
        boolean found = false;
        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++)
                if(arr[i][j]==num)
                    found=true;
        if (found)
            System.out.println("Number Found");
        else
            System.out.println("Number not Found");
    }
}
