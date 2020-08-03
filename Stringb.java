package SearchSort;

import java.io.*;
public class   Stringb
{ 
    static void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i,j;
        String temp;
        String a[]=new String[5];
        System.out.println("Enter 5 string values of the array.");
        for(i=0;i<a.length;i++)
        {
            a[i]=in.readLine();
        }

        for(i=0;i<a.length-1;i++)
        {
            for(j=0;j<(a.length-1)-i;j++)
            {

                if(a[j].compareTo(a[j+1])>0)
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;         

                }
            }
        }

        System.out.println("The sorted array is-");
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
