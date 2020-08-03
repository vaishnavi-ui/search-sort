package SearchSort;


import java.io.*;
public class Binary2
{  
    static void main() throws IOException
    {
       
         boolean flag=false;
       InputStreamReader read=new InputStreamReader(System.in);
       BufferedReader in=new BufferedReader(read);
       int a[]=new int[5];
       System.out.println("Enter 5 numbers in descending order");
       for(int i=0;i<5;i++)
       {
           a[i]=Integer.parseInt(in.readLine());
        }
       System.out.println("Enter the number to be searched");
       int num=Integer.parseInt(in.readLine());
       int lb=0; int ub=a.length-1;
       while(ub>=lb)
       {
           int m=(lb+ub)/2;
           if(a[m]==num)
           {
               flag=true;
               break;
            }
            else if(a[m]>num)
            {
                lb=m+1;
            }
            else
            ub=m-1;
        }
        if(flag==true)
        System.out.println("Number Found");
        else
        System.out.println("Number not found");
        
        
            
    }
}
    