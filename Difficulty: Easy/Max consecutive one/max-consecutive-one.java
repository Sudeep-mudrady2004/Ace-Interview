//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.maxConsecutiveCount(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public int maxConsecutiveCount(int[] arr) {
        if(arr.length==0)
        {
            return 0;
        }
        int maxnum=1;
        int count=1;
        for(int i=1;i<arr.length;i++)
        {
        if(arr[i]==arr[i-1])
        {
            count++;
        }
        else
        {
            count=1;
        }
        maxnum=Math.max(maxnum,count);
        }
        return maxnum;
    }
}
