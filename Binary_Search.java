package SearchSort;


import java.io.*;
public class Binary_Search
{   static int s,n,k=0;
    static int lb,ub,m;
    static void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int a[]=new int[10];
        
        System.out.println("Enter the 10 array numbers");
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }
        
        System.out.println("Enter the number to be searched in ascending order");
        s=Integer.parseInt(in.readLine());
        
        lb=0;
        ub=a.length-1;
        while(ub>=lb)
        {
            m=(lb+ub)/2;
            
            if(a[m]==s)
            {
                k++;
                break;
            }
            else if(a[m]>s)
            {
                ub=m-1;
            }
            else
            {
                lb=m+1;
            }
        }
            
        if(k==1)
            {
                System.out.println("Found");
            }
            else
            {
                System.out.println("Not Found");
            }
        }
    }
            
        
        
        
        
        
        
        
        
        
        
        
        
    