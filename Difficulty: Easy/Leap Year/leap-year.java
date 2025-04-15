//{ Driver Code Starts

// } Driver Code Ends

//Back-end complete function Template for Java
import java.util.*;

public class Main {
    public static void main(String args[]) {
        int year;
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if((year%4==0&&year%100!=0)||(year%400==0))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}


//{ Driver Code Starts.
// } Driver Code Ends