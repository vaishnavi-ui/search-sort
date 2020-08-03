package SearchSort;

import java.io.*;
public class Insertion
{
    static void main()throws IOException
    {   InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i,j,newvalue;
        int a[]=new int[5];
        System.out.println("Enter 5 array elements");
        for(i=0;i<5;i++)
        { 
            a[i]=Integer.parseInt(in.readLine());  
        }

        for(i=1;i<a.length;i++)
        {
            newvalue=a[i];
            j=i;
            while(j>0&&newvalue<a[j-1])
            {
                a[j]=a[j-1];
                j=j-1;

            }
            a[j]=newvalue;
        }

        System.out.println("The sorted array is-");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}