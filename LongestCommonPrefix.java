
import java.io.*;
import java.util.*;

class LongestCommonPrefix
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}// } Driver Code Ends



class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        if(n==0)
        return "-1";
        else if(n==1)
        return arr[0];
        else{
         Arrays.sort(arr);
         int size=arr[0].length();
         StringBuilder res= new StringBuilder();
         for(int i=0 ; i<size; i++){
             if(arr[0].charAt(i)==arr[n-1].charAt(i))
             res.append(arr[0].charAt(i));
             else
             break;
         }
         String result=res.toString();
         return result;
        }
        }
        
    }

