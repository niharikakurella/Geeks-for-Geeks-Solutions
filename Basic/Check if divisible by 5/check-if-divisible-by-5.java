//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String N = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.divisibleBy5(N));
        }
    }
}
// } Driver Code Ends




//User function Template for Java
class Solution{
    static int divisibleBy5(String N){
        // code here
        if( N.charAt(N.length()-1) =='0' || N.charAt(N.length()-1)=='5'){
            return 1;
        }
        else
        return 0;
    }
}