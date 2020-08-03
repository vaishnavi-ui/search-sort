package SearchSort;

import java.io.*;
public class Selectn
{
    static void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int a[]=new int[5];
        int t;int i,j;
        System.out.println("Enter 5 numbers ");
        for( i=0;i<a.length;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }
        
        
        for( i=0;i<a.length-1;i++)
        {
            int min=i;
            for( j=i+1;j<a.length;j++)
            {
               if(a[min]>a[j])
               {
                   min=j;
                }
            }
            t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
        System.out.println("The sorted array is");
        for( i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}
