package SearchSort;


import java.io.*;
public class Stringcmp
{ 
    static void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i,j;
        int min;
        String temp;
        String a[]=new String[5];
        System.out.println("Enter the 5 values of the array as a string.");
        for(i=0;i<a.length;i++)
        {
            a[i]=in.readLine();
        }
        
        for(i=0;i<a.length-1;i++)
        {
            min=i;
            for(j=i+1;j<a.length;j++)
            {
              
                if(a[min].compareTo(a[j])>0)
                {
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
            
            
        }
        System.out.println("The sorted array is-");
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
                