package SearchSort;


import java.io.*;
public class Selection
{ 
    static void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i,j;
        int temp,min;
        int a[]=new int[5];
        System.out.println("Enter the values of the array.");
        for(i=0;i<a.length;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }
        
        for(i=0;i<a.length-1;i++)
        {
            min=i;
            for(j=i+1;j<a.length;j++)
            {
              
                if(a[min]>a[j])
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
                