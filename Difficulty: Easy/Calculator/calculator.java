//{ Driver Code Starts

// } Driver Code Ends

import java.util.*;

public class Main {
    public static void main(String args[]) {
      int a,b,result,operator;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      operator=sc.nextInt();
      switch(operator)
      {
          case 1:result=a+b;
          System.out.println(result);
          break;
          case 2:result=a-b;
          System.out.println(result);
          break;
          case 3:result=a*b;
          System.out.println(result);
          break;
          case 4:result=a/b;
          System.out.println(result);
          break;
          default:
          System.out.println("Invalid operator");
      }
      
    }
}


//{ Driver Code Starts.
// } Driver Code Ends